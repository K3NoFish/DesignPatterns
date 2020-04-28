package com.n4k3.abstractdocument.domain;

import java.util.stream.Stream;

import com.n4k3.abstractdocument.Document;
import com.n4k3.abstractdocument.domain.enums.Property;

public interface HasParts extends Document {

    default Stream<Part> getParts() {
        return children(Property.PARTS.toString(), Part::new);
    }
}
