import Loot.LootContainer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LootContainerTest {

    LootContainer testContainer;

    @Before
    public void before() {
        testContainer = new LootContainer("Gold", 10, 20);
    }

    @Test
    public void lootHasSize(){
        assertEquals(20, testContainer.getSize());
    }
}
