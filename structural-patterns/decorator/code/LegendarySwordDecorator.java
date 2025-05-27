public class LegendarySwordDecorator extends SwordDecorator {
    public LegendarySwordDecorator(Sword sword) {
        super(sword);
        setRarity(Rarity.LEGENDARY);
    }

    @Override
    public int getDamage() {
        return decoratedSword.getDamage() * 2;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.LEGENDARY;
    }
}