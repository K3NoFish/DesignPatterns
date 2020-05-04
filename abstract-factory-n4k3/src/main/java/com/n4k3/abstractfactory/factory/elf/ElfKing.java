package com.n4k3.abstractfactory.factory.elf;

import com.n4k3.abstractfactory.factory.King;

public class ElfKing implements King{

    public static final String DESCRIPTION = "ElfKing";

    @Override
    public String getDiscription() {
        return DESCRIPTION;
    }
}
