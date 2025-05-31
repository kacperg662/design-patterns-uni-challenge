package code;

public class Shield implements Item {
    private int value;

    public Shield(int value) {
        this.value = value;
    }

    @Override
    public void sell() {
        System.out.println("Shield sold for " + value + " coins.");
    }
}