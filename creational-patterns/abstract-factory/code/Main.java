public class Main {
    public static void main(String[] args) {
        Shop commonShop = new CommonItems();
        Sword commonSword = commonShop.createSword();
        Shield commonShield = commonShop.createShield();

        System.out.println("Common Sword Damage: " + commonSword.getDamage());
        System.out.println("Common Shield Block: " + commonShield.getBlock());

        Shop rareShop = new RareItems();
        Sword rareSword = rareShop.createSword();
        Shield rareShield = rareShop.createShield();

        System.out.println("Rare Sword Damage: " + rareSword.getDamage());
        System.out.println("Rare Shield Block: " + rareShield.getBlock());
    }
}
