package Homework.HW6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner qq = new Scanner(System.in);
//        Strategy
        PaymentContext context = new PaymentContext();

        System.out.print("Enter the payment amount: ");
        double amount = qq.nextDouble();
        qq.nextLine();

        System.out.println("Choose a payment method:");
        System.out.println("1 - Bank card");
        System.out.println("2 - PayPal");
        System.out.println("3 - Cryptocurrency");

        int choice = qq.nextInt();
        qq.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Enter the card number: ");
                String card = qq.nextLine();
                context.setPaymentStrategy(new ByBankCard(card));
                break;
            case 2:
                System.out.print("Enter PayPal email: ");
                String email = qq.nextLine();
                context.setPaymentStrategy(new ByPayPal(email));
                break;
            case 3:
                System.out.print("Enter your crypto wallet address: ");
                String wallet = qq.nextLine();
                context.setPaymentStrategy(new ByCrypto(wallet));
                break;
            default:
                System.out.println("Unknown choice!");
                return;
        }
        context.pay(amount);
        System.out.println();

//        Observers
        CurrencyExchange exchange = new CurrencyExchange();

        IObserver app = new MobileAppObserver();
        IObserver web = new WebsiteObserver();
        IObserver analytics = new AnalyticsObserver();

        exchange.addObserver(app);
        exchange.addObserver(web);
        exchange.addObserver(analytics);

        exchange.setRate("USD", 470.25);
        System.out.println();
        exchange.setRate("EUR", 495.10);
        System.out.println();
        exchange.removeObserver(analytics);
        exchange.setRate("BTC", 27000.0);
    }
}
