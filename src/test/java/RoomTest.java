import Characters.Enemies.Enemy;
import Characters.Enemies.EnemyType;
import Loot.LootContainer;
import Rooms.Room;
import Rooms.Size;
import Rooms.Type;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room testRoom;
    Enemy testEnemy;
    LootContainer testLootContainer;

    @Before
    public void before(){
        testEnemy = new Enemy("Goblin McGoblinson", 10, 10 ,10, 10, 10, EnemyType.GOBLIN);
        testLootContainer = new LootContainer("Gold", 100, 5);
        testRoom = new Room(Size.LARGE, Type.DUNGEON, testEnemy, testLootContainer);
    }
//    @Test
//    public void roomHasLoot(){
//        assertEquals()
//    }


}
