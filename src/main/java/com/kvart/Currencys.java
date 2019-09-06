package com.kvart;

public class Currencys {

    private String currency;
    private double saleRateNB;
    private double purchaseRateNB;

    public String getCurrency() {
        return currency;
    }

    public double getSaleRateNB() {
        return saleRateNB;
    }

    public double getPurchaseRateNB() {
        return purchaseRateNB;
    }

    @Override
    public String toString() {
        return "Currencys{" +
                "currency='" + currency + '\'' +
                ", saleRateNB=" + saleRateNB +
                ", purchaseRateNB=" + purchaseRateNB +
                '}';
    }
}
