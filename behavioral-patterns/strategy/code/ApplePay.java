public class ApplePay implements PaymentStrategy{
    private String appleId;

    public ApplePay(String appleId) {
        this.appleId = appleId;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Apple Pay: " + appleId + ", amount: " + amount);
    }
}
