package Characters.Magical;

import Characters.CharacterBase;
import Characters.Healer.HealingTool;

public class Magical extends CharacterBase{

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

}
