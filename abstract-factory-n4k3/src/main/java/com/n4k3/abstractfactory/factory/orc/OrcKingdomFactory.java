package com.n4k3.abstractfactory.factory.orc;

import com.n4k3.abstractfactory.factory.Army;
import com.n4k3.abstractfactory.factory.Castle;
import com.n4k3.abstractfactory.factory.King;
import com.n4k3.abstractfactory.factory.KingdomFactory;

public class OrcKingdomFactory implements KingdomFactory {

    @Override
    public Army createArmy() {
        return new OrcArmy();
    }

    @Override
    public Castle createCastle() {
        return new OrcCastle();
    }

    @Override
    public King createKing() {
        return new OrcKing();
    }

}
