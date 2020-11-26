package Rooms;

import Characters.Enemies.Enemy;
import Loot.LootContainer;

public class Room {

    private Size size;
    private Type type;
    private Enemy enemy;
    private LootContainer lootContainer;

    public Room(Size size, Type type, Enemy enemy, LootContainer lootContainer){
        this.size = size;
        this.type = type;
        this.enemy = enemy;
        this.lootContainer = lootContainer;
    }



}
