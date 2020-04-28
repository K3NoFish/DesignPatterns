package com.n4k3.abstractdocument.domain;

import java.util.Map;

import com.n4k3.abstractdocument.AbstractDocument;

public class Car extends AbstractDocument implements HasParts, HasModel, HasPrice {

    public Car(Map<String, Object> properties) {
        super(properties);
    }
}
