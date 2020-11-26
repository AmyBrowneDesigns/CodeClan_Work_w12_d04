package Characters.Healer;

import Characters.CharacterBase;

public class Healer extends CharacterBase {

    private HealerType healerType;
    private HealingTool healingTool;


    public Healer(String name, int health, int armour, int agility, int strength, HealerType healerType, HealingTool healingTool) {
        super(name, health, armour, agility, strength);
        this.healerType = healerType;
        this.healingTool = healingTool;
    }

    public HealerType getHealerType(){
        return this.healerType;
    }

    public HealingTool getHealingTool(){
        return this.healingTool;
    }


}
