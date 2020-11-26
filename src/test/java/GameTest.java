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

public class GameTest {

    Game testGame;
    Magical wizard;
    Enemy orc;
    LootContainer treasureChest;
    Room room;

    @Before
    public void before(){
        wizard = new Magical("Gandalf", 30, 40, 20, 50, MagicalType.WIZARD, Spell.CRUCIO, Familiar.PSYCHOSQUIRREL);
        orc = new Enemy("jericho", 20, 10, 30, 20, 80, EnemyType.ORC,);
        treasureChest = new LootContainer("Rubies", 200, 10);
        room = new Room(Size.SMALL, Type.CAVE, orc,treasureChest);
    }

    @Test
    public void wizardCanAttackOrc(){
        wizard.attack()
    }


}
