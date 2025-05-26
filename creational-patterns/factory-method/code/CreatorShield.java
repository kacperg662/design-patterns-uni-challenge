public class CreatorShield implements Creator{
    @Override
    public Item create(Rarity rarity) {
        return new Shield(rarity);
    }
}
