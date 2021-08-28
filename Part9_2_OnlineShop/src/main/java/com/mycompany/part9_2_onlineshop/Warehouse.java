package com.mycompany.part9_2_onlineshop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Warehouse {

    private Map<String, Integer> products = new HashMap<>();
    private Map<String, Integer> stocks = new HashMap<>();

    public Warehouse() {
    }

    public Warehouse(Map<String, Integer> products) {
        this.products = products;
        this.stocks = stocks;
    }

    public void addProduct(String product, int price, int stock) {
        this.products.put(product, price);
        this.stocks.put(product, stock);

    }

    public int price(String product) {

        int joe = 0;
        for (String object : products.keySet()) {
            for (Integer object1 : products.values()) {
                if (object.equals(product)) {
                    return joe = object1.intValue();
                }
            }
        }
        if (!(this.products.containsKey(product))) {
            return joe = -99;
        }
        return joe;
    }

    public int stock(String product) {
        int joe2 = 0;
        for (String object : stocks.keySet()) {
            for (Integer object1 : stocks.values()) {
                if (object.equals(product)) {
                    return joe2 = object1.intValue();
                }
            }
        }
        if (!(this.stocks.containsKey(product))) {
            return joe2 = 0;
        }
        return joe2;
    }

    public boolean take(String product) {
        if (this.stock(product) > 0) {
            this.stocks.put(product, this.stocks.get(product) - 1);
            return true;
        } else {
            return false;
        }

    }

    public Set<String> products() {
        Set<String> productsList = this.products.keySet();
        return productsList;
    }
}
