package Characters.Magical;

public enum Spell {

    FIREBALL(10),
    LIGHTNINGBOLT(8),
    STUN(0),
    CRUCIO(4);

    private final int damage;

    Spell(int damage) { this.damage = damage; }

    public int getDamage() { return this.damage; }

}
