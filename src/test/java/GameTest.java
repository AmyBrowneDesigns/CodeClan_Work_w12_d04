import Characters.Enemies.Enemy;
import Characters.Enemies.EnemyType;
import Characters.Magical.Familiar;
import Characters.Magical.Magical;
import Characters.Magical.MagicalType;
import Characters.Magical.Spell;
import Loot.LootContainer;
import Rooms.Room;
import Rooms.Type;
import Rooms.Size;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Game testGame;
    Magical wizard;
    Enemy orc;
    LootContainer treasureChest;
    Room room;

    @Before
    public void before(){
        wizard = new Magical("Gandalf", 30, 30, 30, 30, MagicalType.WIZARD, Spell.CRUCIO, Familiar.PSYCHOSQUIRREL);
        orc = new Enemy("jericho", 10, 10, 10, 10, 80, EnemyType.ORC);
        treasureChest = new LootContainer("Rubies", 200, 10);
        room = new Room(Size.SMALL, Type.CAVE, orc,treasureChest);
    }

    @Test
    public void wizardCanAttackOrc(){
        wizard.attack(orc);
        assertEquals(0, orc.getHealth());
    }


}
