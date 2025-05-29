public class Sword implements Prototype{
    private int damage;
    private String rarity;

    public Sword(int damage, String rarity) {
        this.damage = damage;
        this.rarity = rarity;
    }

    public Sword(Sword sword) {
        this.damage = sword.damage;
        this.rarity = sword.rarity;
    }

    @Override
    public Sword clone() {
        return new Sword(this);
    }

    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public String getRarity() {
        return rarity;
    }
}
