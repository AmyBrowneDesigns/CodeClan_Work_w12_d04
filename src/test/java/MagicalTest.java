import Characters.Magical.Magical;
import Characters.Magical.MagicalType;
import Characters.Magical.Equipped;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MagicalTest {

    Magical testMagical;

    @Before
    public void before(){
        testMagical = new Magical ("Gandalf", 30, 20, 60, 100, MagicalType.WIZARD, Equipped.FIREBALL);
    }

    @Test
    public void MagicalHasType(){
        assertEquals(MagicalType.WIZARD, testMagical.getMagicalType());
    }

    @Test
    public void hasMagicalSpell(){
        assertEquals(Equipped.FIREBALL, testMagical.getSpell());
    }
}
