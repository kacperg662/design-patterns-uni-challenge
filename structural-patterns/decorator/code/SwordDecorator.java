public abstract class SwordDecorator extends Sword {
    protected Sword decoratedSword;

    public SwordDecorator(Sword sword) {
        super(sword.getRarity(), sword.getDamage());
        this.decoratedSword = sword;
    }

    @Override
    public abstract int getDamage();

    @Override
    public abstract Rarity getRarity();
}