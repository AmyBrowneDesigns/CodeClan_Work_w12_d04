package Characters.Fighter;

public enum Weapons {

    SWORD(10),
    AXE(8),
    CLUB(6),
    BOWANDARROW(4);

    private final int damage;

    Weapons(int damage) {
        this.damage = damage;
    }

    public int getDamage(){
        return this.damage;
    }
}
