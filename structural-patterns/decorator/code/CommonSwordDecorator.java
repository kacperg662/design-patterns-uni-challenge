public class CommonSwordDecorator extends SwordDecorator {
    public CommonSwordDecorator(Sword sword) {
        super(sword);
        setRarity(Rarity.COMMON);
    }

    @Override
    public int getDamage() {
        return decoratedSword.getDamage();
    }

    @Override
    public Rarity getRarity() {
        return Rarity.COMMON;
    }
}