package org.sprint;

import java.util.ArrayList;
import java.util.List;

public class StockExchangeAgent implements Observable {
    private List<Observer> observers = new ArrayList<>();
    private String stockStatus;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(stockStatus);
        }
    }

    public void changeStockStatus(String status) {
        this.stockStatus = status;
        notifyObservers();
    }
}