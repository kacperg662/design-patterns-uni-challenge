package code;

public class Sword implements Item{
    private int value;

    public Sword(int value) {
        this.value = value;
    }

    @Override
    public void sell() {
        System.out.println("Sword sold for " + value + " coins.");
    }
}