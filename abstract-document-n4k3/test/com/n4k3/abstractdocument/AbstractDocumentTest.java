package com.n4k3.abstractdocument;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class AbstractDocumentTest {

    private final String KEY = "key";
    private final String VALUE = "value";

    private class DocumentImplementation extends AbstractDocument {

        public DocumentImplementation(Map<String, Object> properties) {
            super(properties);
        }
    }

    private DocumentImplementation document = new DocumentImplementation(new HashMap<>());

    @Test
    public void shouldPutAndGetValue() {
        document.put(KEY, VALUE);
        assertEquals(VALUE, document.get(KEY));
    }

    @Test
    public void shouldRetrieveChildren() {
        var children = List.of(Map.of(), Map.of());
        document.put(KEY, children);

        var childrenStream = document.children(KEY, DocumentImplementation::new);
        assertNotNull(children);
        assertEquals(2, childrenStream.count());
    }

    @Test
    public void shouldRetrieveEmptyStreamForNonExistingChildre() {
        var children = document.children(KEY,  DocumentImplementation::new);
        assertNotNull(children);
        assertEquals(0, children.count());
    }


}
