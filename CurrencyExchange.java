package Homework.HW6;

import java.util.*;

public class CurrencyExchange implements ISubject {
    private Map<String, Double> rates = new HashMap<>();
    private List<IObserver> observers = new ArrayList<>();

    @Override
    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer : observers) {
            for (var entry : rates.entrySet()) {
                observer.Update(entry.getKey(), entry.getValue());
            }
        }
    }

    public void setRate(String currency, double rate) {
        rates.put(currency, rate);
        notifyObservers();
    }
}