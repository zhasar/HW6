package Homework.HW6;

public class AnalyticsObserver implements IObserver {
    @Override
    public void Update(String currency, double rate) {
        System.out.println("Analytics tracking: " + currency + " = " + rate);
    }
}