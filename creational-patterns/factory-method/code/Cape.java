public class Cape implements Item{
    private final Type type;
    private final Rarity rarity;

    public Cape(Rarity rarity) {
        this.type = Type.Dexterity;
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
