package Characters.Fighter;

import Characters.CharacterBase;
import Loot.LootContainer;

public class Fighter extends CharacterBase {

    private FighterType fighterType;
    private Weapon weapon;


    public Fighter(String name, int health, int armour, int agility, int strength, FighterType fighterType, Weapon weapon) {
        super(name, health, armour, agility, strength);
        this.fighterType = fighterType;
        this.weapon = weapon;
    }

    public FighterType getType(){
        return this.fighterType;
    }

    public Weapon getWeapon(){
        return this.weapon;
    }

    public void changeWeapon(Weapon newWeapon){
        this.weapon = newWeapon;
    }

    public int getTreasure(LootContainer lootContainer) {
        int lootWorth = lootContainer.getTheValue() * lootContainer.getSize();
        lootContainer.emptyContainer();
        addLootToBag(lootWorth);
        return lootWorth;
    }
}


