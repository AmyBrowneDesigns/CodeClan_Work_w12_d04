package Characters;

abstract public class CharacterBase {

    private String name;
    private int health;
    private int armour;
    private int agility;
    private int strength;

    public CharacterBase(String name, int health, int armour, int agility, int strength){
        this.name = name;
        this.health = health;
        this.armour = armour;
        this.agility = agility;
        this.strength = strength;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public int getHealth(){
        return this.health;
    }

    public void setHealth(int newHealth){
        this.health = newHealth;
    }

    public int getArmour(){
        return this.armour;
    }

    public void setArmour(int newArmour){
        this.armour = newArmour;
    }

    public int getAgility(){
        return this.agility;
    }

    public void setAgility(int newAgility){
        this.agility = newAgility;
    }

    public int getStrength(){
        return this.strength;
    }

    public void setStrength(int newStrength){
        this.strength = newStrength;
    }

}
