package com.n4k3.abstractfactory;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.n4k3.abstractfactory.factory.FactoryMaker;
import com.n4k3.abstractfactory.factory.FactoryMaker.KingdomType;
import com.n4k3.abstractfactory.factory.KingdomFactory;
import com.n4k3.abstractfactory.factory.elf.ElfArmy;
import com.n4k3.abstractfactory.factory.elf.ElfCastle;
import com.n4k3.abstractfactory.factory.elf.ElfKing;
import com.n4k3.abstractfactory.factory.orc.OrcArmy;
import com.n4k3.abstractfactory.factory.orc.OrcCastle;
import com.n4k3.abstractfactory.factory.orc.OrcKing;

class AbstractFactoryTest {

    private App app = new App();
    private KingdomFactory elfFactory;
    private KingdomFactory orcFactory;

    @BeforeEach
    public void setUp() {
        elfFactory = FactoryMaker.makeFactory(KingdomType.ELF);
        orcFactory = FactoryMaker.makeFactory(KingdomType.ORC);
    }

    @Test
    public void king() {
        final var elfKing = app.getKing(elfFactory);
        assertTrue(elfKing instanceof ElfKing);
        assertEquals(ElfKing.DESCRIPTION, elfKing.getDiscription());
        final var orcKing = app.getKing(orcFactory);
        assertTrue(orcKing instanceof OrcKing);
        assertEquals(OrcKing.DESCRIPTION, orcKing.getDiscription());
    }

    @Test
    public void castle() {
        final var elfCastle = app.getCastle(elfFactory);
        assertTrue(elfCastle instanceof ElfCastle);
        assertEquals(ElfCastle.DESCRIPTION, elfCastle.getDiscription());
        final var orcCastle = app.getCastle(orcFactory);
        assertTrue(orcCastle instanceof OrcCastle);
        assertEquals(OrcCastle.DESCRIPTION, orcCastle.getDiscription());
    }

    @Test
    public void army() {
        final var elfArmy = app.getArmy(elfFactory);
        assertTrue(elfArmy instanceof ElfArmy);
        assertEquals(ElfArmy.DESCRIPTION, elfArmy.getDiscription());
        final var orcArmy = app.getArmy(orcFactory);
        assertTrue(orcArmy instanceof OrcArmy);
        assertEquals(OrcArmy.DESCRIPTION, orcArmy.getDiscription());
    }

    @Test
    public void createElfKingdom() {
        app.createKingdom(elfFactory);
        final var king = app.getKing();
        final var castle = app.getCastle();
        final var army = app.getArmy();
        assertTrue(king instanceof ElfKing);
        assertTrue(castle instanceof ElfCastle);
        assertTrue(army instanceof ElfArmy);
        assertEquals(ElfKing.DESCRIPTION, king.getDiscription());
        assertEquals(ElfCastle.DESCRIPTION, castle.getDiscription());
        assertEquals(ElfArmy.DESCRIPTION, army.getDiscription());
    }


    @Test
    public void createOrcKingdom() {
        app.createKingdom(orcFactory);
        final var king = app.getKing();
        final var castle = app.getCastle();
        final var army = app.getArmy();
        assertTrue(king instanceof OrcKing);
        assertTrue(castle instanceof OrcCastle);
        assertTrue(army instanceof OrcArmy);
        assertEquals(OrcKing.DESCRIPTION, king.getDiscription());
        assertEquals(OrcCastle.DESCRIPTION, castle.getDiscription());
        assertEquals(OrcArmy.DESCRIPTION, army.getDiscription());
    }
}
