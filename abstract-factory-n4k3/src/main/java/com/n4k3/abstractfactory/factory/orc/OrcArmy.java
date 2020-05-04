package com.n4k3.abstractfactory.factory.orc;

import com.n4k3.abstractfactory.factory.Army;

public class OrcArmy implements Army {

    public static final String DESCRIPTION = "OrcArmy";

    @Override
    public String getDiscription() {
        return DESCRIPTION;
    }
}
