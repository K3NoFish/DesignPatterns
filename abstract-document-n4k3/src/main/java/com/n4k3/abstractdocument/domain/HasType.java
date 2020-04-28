package com.n4k3.abstractdocument.domain;

import java.util.Optional;

import com.n4k3.abstractdocument.Document;
import com.n4k3.abstractdocument.domain.enums.Property;

public interface HasType extends Document {

    default Optional<String> getType() {
        return Optional.ofNullable((String) get(Property.TYPE.toString()));
    }
}
