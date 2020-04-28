package com.n4k3.abstractdocument.domain;

import java.util.Optional;

import com.n4k3.abstractdocument.Document;
import com.n4k3.abstractdocument.domain.enums.Property;

public interface HasModel extends Document {

    default Optional<String> getModel() {
        return Optional.ofNullable((String) get(Property.MODEL.toString()));
    }
}
