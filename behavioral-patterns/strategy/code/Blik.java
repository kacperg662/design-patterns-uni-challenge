public class Blik implements PaymentStrategy{
    private String bankAccount;

    public Blik(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Blik: " + bankAccount + ", amount: " + amount);
    }
}
