public class GooglePay implements PaymentStrategy{
    private String googleId;

    public GooglePay(String googleId) {
        this.googleId = googleId;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Google Pay: " + googleId + ", amount: " + amount);
    }
}
