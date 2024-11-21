package org.sprint;

public class StockExchangeAgency implements Observer {
    private String agencyName;

    public StockExchangeAgency(String name) {
        this.agencyName = name;
    }

    @Override
    public void update(String stockStatus) {
        System.out.println("Agency " + agencyName + " received stock status update: " + stockStatus);
    }
}