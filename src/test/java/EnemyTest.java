import Characters.Enemies.Enemy;
import Characters.Enemies.EnemyType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyTest {

    Enemy testEnemy;

    @Before
    public void before(){
        testEnemy = new Enemy("Hulk Hogan", 30, 20, 10, 40, 80, EnemyType.TROLL);
    }

    @Test
    public void hasEnemyType(){
        assertEquals(EnemyType.TROLL, testEnemy.getType());
    }
}
