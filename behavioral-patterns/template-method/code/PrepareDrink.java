public abstract class PrepareDrink {
    public String prepare(String drink) {
        String glass = glass();
        String chosenDrink = pour(drink);
        String extras = addExtras();
        return result(glass, chosenDrink, extras);
    }

    public abstract String glass();

    public String pour(String drink) {
        System.out.println("Pouring " + drink + "... ");
        return drink;
    }

    public abstract String addExtras();

    public String result(String glass, String chosenDrink, String extras) {
        return (chosenDrink + ", in " + glass + " with extra " + extras + "\n");
    }

}
