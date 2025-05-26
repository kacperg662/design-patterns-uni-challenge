public class CreatorCape implements Creator{
    @Override
    public Item create(Rarity rarity) {
        return new Cape(rarity);
    }
}
