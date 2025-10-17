package Homework.HW6;

public class WebsiteObserver implements IObserver {
    @Override
    public void Update(String currency, double rate) {
        System.out.println("Website updated: " + currency + " -> " + rate);
    }
}