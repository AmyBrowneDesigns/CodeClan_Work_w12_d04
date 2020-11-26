import Characters.Fighter.Fighter;
import Characters.Fighter.FighterType;
import Characters.Fighter.Weapon;
import Loot.LootContainer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FighterTest {

    Fighter testFighter;

    @Before
    public void before(){
        testFighter = new Fighter("Kane", 100, 50, 40, 60, FighterType.DWARF, Weapon.AXE);
    }

    @Test
    public void fighterHasAType(){
        assertEquals(FighterType.DWARF, testFighter.getType());
    }

    @Test
    public void fighterHasAWeapon(){
        assertEquals(Weapon.AXE, testFighter.getWeapon());
    }

    @Test
    public void fighterCanChangeWeapon() {
        testFighter.changeWeapon(Weapon.CLUB);
        assertEquals(Weapon.CLUB, testFighter.getWeapon());
    }

    @Test
    public void fighterCanGetLoot() {
        LootContainer testLootContainer = new LootContainer("Gold", 10, 10);
        assertEquals(100, testFighter.getTreasure(testLootContainer));
        assertEquals(0, testLootContainer.getTheValue());
    }

}
