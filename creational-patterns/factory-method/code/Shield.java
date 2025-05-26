public class Shield implements Item{
    private final Type type;
    private final Rarity rarity;

    public Shield(Rarity rarity) {
        this.type = Type.Defense;
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
