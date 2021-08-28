package com.mycompany.part9_2_onlineshop;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    Map<String, Item> items;

    public ShoppingCart() {
        this.items = new HashMap<>();
    }

    public void add(String product, int price) {
        if (this.items.keySet().contains(product)) {
            increaseQuantity(product);
        } else {
            this.items.put(product, new Item(product, 1, price));
        }
    }

    public int price() {
        int aux1 = 0;
        for (Item object : items.values()) {
            aux1 = aux1 + object.price();

        }
        return aux1;
    }

    public void increaseQuantity(String product) {
        this.items.get(product).increaseQuantity();
    }

    @Override
    public String toString() {
        return "ShoppingCart{" + "items=" + items + '}';
    }

}
