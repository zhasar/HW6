package Homework.HW6;

public class ByBankCard implements IPaymentStrategy{
    private String cardNumber;

    public ByBankCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println(amount + " tenge was paid by bank card. Card number: " + cardNumber);
    }
}
