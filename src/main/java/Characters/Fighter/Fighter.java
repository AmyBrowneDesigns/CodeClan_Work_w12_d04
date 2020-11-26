package Characters.Fighter;

import Characters.CharacterBase;

public class Fighter extends CharacterBase {

    private FighterType fighterType;
    private Equipped equipped;


    public Fighter(String name, int health, int armour, int agility, int strength, FighterType fighterType, Equipped equipped) {
        super(name, health, armour, agility, strength);
        this.fighterType = fighterType;
        this.equipped = equipped;
    }

    public FighterType getType(){
        return this.fighterType;
    }

    public Equipped getWeapon(){
        return this.equipped;
    }
}

