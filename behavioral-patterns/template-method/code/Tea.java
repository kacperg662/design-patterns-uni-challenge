public class Tea extends PrepareDrink{
    @Override
    public String prepare(String drink) {
        return super.prepare(drink);
    }

    @Override
    public String glass() {
        System.out.println("Preparing regular glass...");
        return "glass";
    }

    @Override
    public String addExtras() {
        System.out.println("Adding sugar...");
        return "sugar";
    }
}
