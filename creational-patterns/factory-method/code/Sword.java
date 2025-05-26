public class Sword implements Item{
    private final Type type;
    private final Rarity rarity;

    public Sword(Rarity rarity) {
        this.type = Type.Attack;
        this.rarity = rarity;
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public Rarity getRarity() {
        return rarity;
    }
}
