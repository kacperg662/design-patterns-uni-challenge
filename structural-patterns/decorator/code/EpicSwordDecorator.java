public class EpicSwordDecorator extends SwordDecorator {
    public EpicSwordDecorator(Sword sword) {
        super(sword);
        setRarity(Rarity.EPIC);
    }

    @Override
    public int getDamage() {
        return (int)(decoratedSword.getDamage() * 1.5);
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }
}