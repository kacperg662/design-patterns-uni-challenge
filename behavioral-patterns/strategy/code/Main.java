public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(new CreditCard("1234-5678-9012-3456"));
        cart.checkout(100);

        cart.setPaymentStrategy(new PayPal("user@example.com"));
        cart.checkout(200);

        cart.setPaymentStrategy(new ApplePay("john.appleseed@icloud.com"));
        cart.checkout(300);
    }
}
