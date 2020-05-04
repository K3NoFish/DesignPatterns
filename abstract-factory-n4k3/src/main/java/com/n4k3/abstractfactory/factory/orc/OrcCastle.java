package com.n4k3.abstractfactory.factory.orc;

import com.n4k3.abstractfactory.factory.Castle;

public class OrcCastle implements Castle {

    public static final String DESCRIPTION = "OrcCastle";

    @Override
    public String getDiscription() {
        return DESCRIPTION;
    }
}
