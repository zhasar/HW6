package Homework.HW6;

public class MobileAppObserver implements IObserver {
    @Override
    public void Update(String currency, double rate) {
        System.out.println("Mobile App: " + currency + " = " + rate);
    }
}