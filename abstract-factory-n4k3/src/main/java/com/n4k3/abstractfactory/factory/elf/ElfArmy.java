package com.n4k3.abstractfactory.factory.elf;

import com.n4k3.abstractfactory.factory.Army;

public class ElfArmy implements Army {

    public static final String DESCRIPTION = "ElfArmy";

    @Override
    public String getDiscription() {
        return DESCRIPTION;
    }

}
