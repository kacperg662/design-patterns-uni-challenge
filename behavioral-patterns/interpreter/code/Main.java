public class Main {
    public static void main(String[] args) {
        // (6 + 7) - (2 + 3)
        Expression expression = new Subtract(
                new Add(new Number(6), new Number(7)),
                new Add(new Number(2), new Number(3))
        );

        int result = expression.interpret();
        System.out.println("Result : " + result);
    }
}