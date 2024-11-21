package org.sprint;

public class Main {
    public static void main(String[] args) {
        StockExchangeAgent stockExchangeAgent = new StockExchangeAgent();

        StockExchangeAgency agency1 = new StockExchangeAgency("Agency1");
        StockExchangeAgency agency2 = new StockExchangeAgency("Agency2");
        StockExchangeAgency agency3 = new StockExchangeAgency("Agency3");

        stockExchangeAgent.addObserver(agency1);
        stockExchangeAgent.addObserver(agency2);
        stockExchangeAgent.addObserver(agency3);

        stockExchangeAgent.changeStockStatus("up");
        stockExchangeAgent.changeStockStatus("down");
    }
}