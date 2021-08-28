
package com.mycompany.part9_2_onlineshop;


public class Item {
private String product;
private int qty;
private int unitPrice;

    public Item() {
    }

    public Item(String product, int qty, int unitPrice) {
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return product + ": " + qty;
    }
    public int price(){
       return this.qty * this.unitPrice;
        
    }
    public void increaseQuantity(){
        this.qty++;
    }

}
