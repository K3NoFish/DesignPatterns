package com.n4k3.abstractdocument.domain;

import java.util.Optional;

import com.n4k3.abstractdocument.Document;
import com.n4k3.abstractdocument.domain.enums.Property;

public interface HasPrice extends Document {

    default Optional<Number> getPrice() {
        return Optional.ofNullable((Number) get(Property.PRICE.toString()));
    }
}
