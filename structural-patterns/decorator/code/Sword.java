public abstract class Sword {
    protected Rarity rarity;
    protected int damage;

    public Sword(Rarity rarity, int baseDamage) {
        this.rarity = rarity;
        this.damage = baseDamage;
    }

    public abstract int getDamage();
    public abstract Rarity getRarity();

    public void setRarity(Rarity rarity) {
        this.rarity = rarity;
    }
}