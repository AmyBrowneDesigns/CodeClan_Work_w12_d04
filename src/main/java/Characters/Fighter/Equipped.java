package Characters.Fighter;

public enum Equipped {

    SWORD(10),
    AXE(8),
    CLUB(6),
    BOWANDARROW(4);

    private final int damage;

    Equipped(int damage) {
        this.damage = damage;
    }

    public int getDamage(){
        return this.damage;
    }
}
