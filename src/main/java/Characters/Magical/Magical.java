package Characters.Magical;

import Behaviours.IGetTreasure;
import Characters.CharacterBase;
import Characters.Enemies.Enemy;
import Loot.LootContainer;

public class Magical extends CharacterBase implements IGetTreasure {

    private MagicalType magicalType;
    private Spell spell;
    private Familiar familiar;


    public Magical(String name, int health, int armour, int agility, int strength, MagicalType magicalType, Spell spell, Familiar familiar){
        super(name, health, armour, agility, strength);
        this.magicalType = magicalType;
        this.spell = spell;
        this.familiar = familiar;
    }

    public MagicalType getMagicalType(){
        return this.magicalType;
    }

    public Spell getSpell(){
        return this.spell;
    }

    public void changeSpell(Spell newSpell){
        this.spell = newSpell;
    }

    public Familiar getFamiliar(){
        return this.familiar;
    }

    public void changeFamiliar(Familiar newFamiliar){
        this.familiar = newFamiliar;
    }

    public int getTreasure(LootContainer lootContainer) {
        int lootWorth = lootContainer.getTheValue() * lootContainer.getSize();
        lootContainer.emptyContainer();
        addLootToBag(lootWorth);
        return lootWorth;
    }

    @Override
    public void attack(Enemy enemy) {
        int damageDone = spell.getDamage() * getAgility();
        int enemyArmour = enemy.getArmour();
        int excessDamage = damageDone - enemyArmour;

        int enemyHealth = enemy.getHealth();
        int finalDamage = excessDamage - enemyHealth;

        if (finalDamage >= 0) {
            enemy.setHealth(0);
        }

    }
}
