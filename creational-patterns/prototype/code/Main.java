public class Main {
    public static void main(String[] args) {
        Sword sword1 = new Sword(5, "Epic");
        Sword sword2 = new Sword(sword1);

        System.out.println("Sword 1:\nDamage: " + sword1.getDamage() + ", Rarity: " + sword1.getRarity());
        System.out.println("Sword 2:\nDamage: " + sword2.getDamage() + ", Rarity: " + sword2.getRarity());
    }
}
