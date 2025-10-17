package Homework.HW6;

public class ByPayPal implements IPaymentStrategy {
    private String email;

    public ByPayPal(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println(amount + " tenge was paid via PayPal. Account: " + email);
    }
}
