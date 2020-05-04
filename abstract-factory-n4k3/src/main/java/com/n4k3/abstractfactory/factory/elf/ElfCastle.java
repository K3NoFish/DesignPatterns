package com.n4k3.abstractfactory.factory.elf;

import com.n4k3.abstractfactory.factory.Castle;

public class ElfCastle implements Castle {

    public static final String DESCRIPTION = "ElfCastle";

    @Override
    public String getDiscription() {
        return DESCRIPTION;
    }

}
