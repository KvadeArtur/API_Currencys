package com.kvart;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private String date;
    private String bank;
    private String baseCurrencyLit;
    private List<Currencys> exchangeRate = new ArrayList<Currencys>();

    public String getDate() {
        return date;
    }

    public String getBank() {
        return bank;
    }

    public String getBaseCurrencyLit() {
        return baseCurrencyLit;
    }

    public List<Currencys> getExchangeRate() {
        return exchangeRate;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "date='" + date + '\'' +
                ", bank='" + bank + '\'' +
                ", baseCurrencyLit='" + baseCurrencyLit + '\'' +
                ", Currencys=" + exchangeRate +
                '}';
    }
}
