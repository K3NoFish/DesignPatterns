package com.n4k3.abstractdocument.domain;

import java.util.Map;

import com.n4k3.abstractdocument.AbstractDocument;

public class Part extends AbstractDocument implements HasType, HasModel, HasPrice {

    public Part(Map<String, Object> properties) {
        super(properties);
    }
}
