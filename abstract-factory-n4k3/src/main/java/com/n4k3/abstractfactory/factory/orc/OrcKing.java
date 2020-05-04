package com.n4k3.abstractfactory.factory.orc;

import com.n4k3.abstractfactory.factory.King;

public class OrcKing implements King {

    public static final String DESCRIPTION = "OrcKing";

    @Override
    public String getDiscription() {
        return DESCRIPTION;
    }

}
