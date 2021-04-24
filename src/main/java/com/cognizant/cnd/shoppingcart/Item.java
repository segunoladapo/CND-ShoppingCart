package com.cognizant.cnd.shoppingcart;

public class Item {
    private String name;
    private double price;
    private boolean onSale;

    public Item(String name, double price, boolean onSale) {
        this.name = name;
        this.price = price;
        this.setOnSale(onSale);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isOnSale() {
        return onSale;
    }

    public void setOnSale(boolean onSale) {
        this.onSale = onSale;
    }

    @Override
    public boolean equals(Object o) {
        return this.name.equals(((Item) o).name);
    }
}
