import Characters.Fighter.Fighter;
import Characters.Fighter.FighterType;
import Characters.Fighter.Weapon;
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

}
