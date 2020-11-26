package Characters.Magical;

import Characters.CharacterBase;
import Characters.Healer.HealerType;
import Characters.Healer.HealingTool;

public class Magical extends CharacterBase{

    private MagicalType magicalType;
    private Spell spell;


    public Magical(String name, int health, int armour, int agility, int strength, MagicalType magicalType, Spell spell){
        super(name, health, armour, agility, strength);
        this.magicalType = magicalType;
        this.spell = spell;
    }

    public MagicalType getMagicalType(){
        return this.magicalType;
    }
    public Spell getSpell(){
        return this.spell;
    }
}
