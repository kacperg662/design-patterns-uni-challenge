public class Main {
    public static void main(String[] args) {
        Wine wine = new Wine();
        Tea tea = new Tea();

        System.out.println(wine.prepare(wine.getClass().getName()));
        System.out.println(tea.prepare(tea.getClass().getName()));
    }
}
