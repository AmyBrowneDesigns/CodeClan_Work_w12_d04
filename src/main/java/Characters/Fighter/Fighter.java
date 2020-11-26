package Characters.Fighter;

import Characters.CharacterBase;

public class Fighter extends CharacterBase {

    private FighterType fighterType;
    private Weapons weapon;


    public Fighter(String name, int health, int armour, int agility, int strength, FighterType fighterType, Weapons weapon) {
        super(name, health, armour, agility, strength);
        this.fighterType = fighterType;
        this.weapon = weapon;
    }

    public FighterType getType(){
        return this.fighterType;
    }

    public Weapons getWeapon(){
        return this.weapon;
    }
}

