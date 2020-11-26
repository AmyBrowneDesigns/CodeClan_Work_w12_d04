package Characters.Magical;

import Characters.CharacterBase;

public class Magical extends CharacterBase{

    private MagicalType magicalType;
    private Equipped equipped;


    public Magical(String name, int health, int armour, int agility, int strength, MagicalType magicalType, Equipped equipped){
        super(name, health, armour, agility, strength);
        this.magicalType = magicalType;
        this.equipped = equipped;
    }

    public MagicalType getMagicalType(){
        return this.magicalType;
    }
    public Equipped getSpell(){
        return this.equipped;
    }
}
