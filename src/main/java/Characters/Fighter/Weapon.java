package Characters.Fighter;

public enum Weapon {

    SWORD(10),
    AXE(8),
    CLUB(6),
    BOWANDARROW(4);

    private final int damage;

    Weapon(int damage) {
        this.damage = damage;
    }

    public int getDamage(){
        return this.damage;
    }
}
