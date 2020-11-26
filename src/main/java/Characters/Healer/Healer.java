package Characters.Healer;

import Characters.CharacterBase;

public class Healer extends CharacterBase {

    private HealerType healerType;
    private Equipped equipped;


    public Healer(String name, int health, int armour, int agility, int strength, HealerType healerType, Equipped equipped) {
        super(name, health, armour, agility, strength);
        this.healerType = healerType;
        this.equipped = equipped;
    }

    public HealerType getHealerType(){
        return this.healerType;
    }

    public Equipped getHealingTool(){
        return this.equipped;
    }


}
