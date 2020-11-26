import Characters.Magical.Familiar;
import Characters.Magical.Magical;
import Characters.Magical.MagicalType;
import Characters.Magical.Spell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MagicalTest {

    Magical testMagical;

    @Before
    public void before(){
        testMagical = new Magical ("Gandalf", 30, 20, 60, 100, MagicalType.WIZARD, Spell.FIREBALL, Familiar.KILLERBUNNY);
    }

    @Test
    public void MagicalHasType(){
        assertEquals(MagicalType.WIZARD, testMagical.getMagicalType());
    }

    @Test
    public void hasMagicalSpell(){
        assertEquals(Spell.FIREBALL, testMagical.getSpell());
    }

    @Test
    public void magicalCanChangeSpell() {
        testMagical.changeSpell(Spell.LIGHTNINGBOLT);
        assertEquals(Spell.LIGHTNINGBOLT, testMagical.getSpell());
    }

    @Test
    public void magicalCanChangeFamiliar(){
        testMagical.changeFamiliar(Familiar.BATTLEHAMSTER);
        assertEquals(Familiar.BATTLEHAMSTER, testMagical.getFamiliar());
    }
}
