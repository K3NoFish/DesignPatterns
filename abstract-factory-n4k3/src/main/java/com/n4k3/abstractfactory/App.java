package com.n4k3.abstractfactory;

import com.n4k3.abstractfactory.factory.Army;
import com.n4k3.abstractfactory.factory.Castle;
import com.n4k3.abstractfactory.factory.FactoryMaker;
import com.n4k3.abstractfactory.factory.FactoryMaker.KingdomType;
import com.n4k3.abstractfactory.factory.King;
import com.n4k3.abstractfactory.factory.KingdomFactory;

public class App {


    private King king;
    private Castle castle;
    private Army army;

    public King getKing() {
        return king;
    }
    private void setKing(King king) {
        this.king = king;
    }
    public Castle getCastle() {
        return castle;
    }
    private void setCastle(Castle castle) {
        this.castle = castle;
    }
    public Army getArmy() {
        return army;
    }
    private void setArmy(Army army) {
        this.army = army;
    }

    King getKing(final KingdomFactory factory) {
        return factory.createKing();
    }

    Castle getCastle(final KingdomFactory factory) {
        return factory.createCastle();
    }

    Army getArmy(final KingdomFactory factory) {
        return factory.createArmy();
    }

    public void createKingdom(final KingdomFactory factory) {
        setKing(factory.createKing());
        setCastle(factory.createCastle());
        setArmy(factory.createArmy());
    }


    public static void main(String[] args) {

        var app = new App();
        app.createKingdom(FactoryMaker.makeFactory(KingdomType.ELF));
        System.out.println(app.getArmy().getDiscription());
        System.out.println(app.getCastle().getDiscription());
        System.out.println(app.getKing().getDiscription());
        app.createKingdom(FactoryMaker.makeFactory(KingdomType.ORC));
        System.out.println(app.getArmy().getDiscription());
        System.out.println(app.getCastle().getDiscription());
        System.out.println(app.getKing().getDiscription());
    }
}
