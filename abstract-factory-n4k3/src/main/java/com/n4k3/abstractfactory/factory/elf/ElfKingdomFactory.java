package com.n4k3.abstractfactory.factory.elf;

import com.n4k3.abstractfactory.factory.Army;
import com.n4k3.abstractfactory.factory.Castle;
import com.n4k3.abstractfactory.factory.King;
import com.n4k3.abstractfactory.factory.KingdomFactory;

public class ElfKingdomFactory implements KingdomFactory {

    @Override
    public Army createArmy() {
        return new ElfArmy();
    }

    @Override
    public Castle createCastle() {
        return new ElfCastle();
    }

    @Override
    public King createKing() {
        return new ElfKing();
    }

}
