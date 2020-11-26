import Characters.Fighter.Fighter;
import Characters.Fighter.FighterType;
import Characters.Fighter.Weapons;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FighterTest {

    Fighter testFighter;

    @Before
    public void before(){
        testFighter = new Fighter("Kane", 100, 50, 40, 60, FighterType.DWARF, Weapons.AXE);
    }

    @Test
    public void fighterHasAType(){
        assertEquals(FighterType.DWARF, testFighter.getType());
    }

    @Test
    public void fighterHasAWeapon(){
        assertEquals(Weapons.AXE, testFighter.getWeapon());
    }

}
