package Homework.HW6;

public class ByCrypto implements IPaymentStrategy{
    private String walletAddress;

    public ByCrypto(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public void pay(double amount) {
        System.out.println(amount + " tenge was paid via cryptocurrency. Wallet address: " + walletAddress);
    }
}
