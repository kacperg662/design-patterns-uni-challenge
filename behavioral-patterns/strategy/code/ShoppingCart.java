public class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.paymentStrategy = strategy;
    }

    public void checkout(int total) {
        if (paymentStrategy == null) {
            throw new IllegalStateException("No payment method chosen!");
        }
        paymentStrategy.pay(total);
    }
}
