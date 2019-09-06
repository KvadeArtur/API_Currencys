package com.kvart;

import com.google.gson.Gson;

import java.util.Scanner;

public class Main {

    private static final String URL = "https://api.privatbank.ua/p24api/exchange_rates?json&date=";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату: ");
        String date = scanner.nextLine();

        String json = HttpUtil.sendRequest(URL + date);
        Gson gson = new Gson();
        Bank bank = gson.fromJson(json, Bank.class);

        Currencys currencys = null;
        if (bank.getExchangeRate().size() == 0) {
            System.out.println("За эту дату нет данных");
        } else {
            for (int i = 0; i < bank.getExchangeRate().size(); i++) {
                if ("USD".equals(bank.getExchangeRate().get(i).getCurrency())) {
                    currencys = bank.getExchangeRate().get(i);
                    System.out.println("Курс за этот день: \n" + currencys);
                    break;
                }
            }

            if (currencys == null) {
                System.out.println("Курс доллара за этот день отсутствует");
            }
        }

    }
}
