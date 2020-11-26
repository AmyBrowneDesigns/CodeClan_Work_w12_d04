import Characters.Healer.Healer;
import Characters.Healer.HealerType;
import Characters.Healer.HealingTool;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HealerTest {

    Healer testHealer;

    @Before
    public void before(){
        testHealer = new Healer("TRIPLE HHH",20, 60, 40, 300, HealerType.CLERIC, HealingTool.POTION);
    }

    @Test
    public void healerHasType(){
        assertEquals(HealerType.CLERIC, testHealer.getHealerType());
    }

    @Test
    public void hasHealerTool(){
        assertEquals(HealingTool.POTION, testHealer.getHealingTool());
    }
}


