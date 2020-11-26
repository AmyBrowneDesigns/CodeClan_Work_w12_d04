package Characters.Healer;

import Behaviours.IGetTreasure;
import Characters.CharacterBase;
import Loot.LootContainer;

public class Healer extends CharacterBase implements IGetTreasure {

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

    public void changeHealingTool(HealingTool newHealingTool){
        this.healingTool = newHealingTool;
    }

    public int getTreasure(LootContainer lootContainer) {
        int lootWorth = lootContainer.getTheValue() * lootContainer.getSize();
        lootContainer.emptyContainer();
        addLootToBag(lootWorth);
        return lootWorth;
    }

}
