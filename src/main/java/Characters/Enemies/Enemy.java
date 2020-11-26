package Characters.Enemies;

import Characters.CharacterBase;

public class Enemy extends CharacterBase {

    private EnemyType enemyType;
    private int evilness;

    public Enemy(String name, int health, int armour, int agility, int strength, int evilness, EnemyType enemyType) {
        super(name, health, armour, agility, strength);
        this.evilness = evilness;
        this.enemyType = enemyType;
    }

    public int getEvilness() {
        return evilness;
    }

    public void setEvilness(int evilness) {
        this.evilness = evilness;
    }

    public EnemyType getEnemyType() {
        return enemyType;
    }
    public void setEnemyType(EnemyType enemyType) {
        this.enemyType = enemyType;
    }
    public EnemyType getType(){
        return this.enemyType;
    }
}
