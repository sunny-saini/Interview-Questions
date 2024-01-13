package com.core.roughWork;

import java.util.HashMap;
import java.util.Map;

class Account {
    private String accountType;
    private double price;

    public Account(String accountType, double price) {
        this.accountType = accountType;
        this.price = price;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getPrice() {
        return price;
    }
}

public class PriceDifferenceExample {

    public static void main(String[] args) {
        // First map: itemId to Account
        Map<String, Account> itemAccountMap = new HashMap<>();
        itemAccountMap.put("item1", new Account("Type1", 100.0));
        itemAccountMap.put("item2", new Account("Type2", 150.0));
        itemAccountMap.put("item3", new Account("Type3", 200.0));

        // Second map: AccountType to actual price
        Map<String, Double> accountTypePriceMap = new HashMap<>();
        accountTypePriceMap.put("Type1", 110.0);
        accountTypePriceMap.put("Type2", 160.0);
        accountTypePriceMap.put("Type3", 210.0);

        // Compare AccountType and find price difference
        for (Map.Entry<String, Account> entry : itemAccountMap.entrySet()) {
            String itemId = entry.getKey();
            Account account = entry.getValue();

            // Get the actual price from the second map using AccountType
            double actualPrice = accountTypePriceMap.get(account.getAccountType());

            // Calculate the price difference
            double priceDifference = actualPrice - account.getPrice();

            System.out.println("Item ID: " + itemId +
                    ", Account Type: " + account.getAccountType() +
                    ", Price Difference: " + priceDifference);
        }
    }
}
