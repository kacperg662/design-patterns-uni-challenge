public class Wine extends PrepareDrink{
    @Override
    public String prepare(String drink) {
        return super.prepare(drink);
    }

    @Override
    public String glass() {
        System.out.println("Preparing wine glass...");
        return "wine glass";
    }

    @Override
    public String addExtras() {
        return "nothing";
    }
}
