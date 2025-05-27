public class BasicSword extends Sword {
    public BasicSword() {
        super(Rarity.COMMON, 10);
    }

    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public Rarity getRarity() {
        return rarity;
    }
}