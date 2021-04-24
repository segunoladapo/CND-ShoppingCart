package com.cognizant.cnd.shoppingcart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cart {
    List<Item> lineItems = new ArrayList<>();

    public void addItem(Item item){
        lineItems.add(item);
    }

    public void addAllItems(Item... items){
        lineItems.addAll(Arrays.asList(items));
    }

    public int itemCount(){
        return lineItems.size();
    }

    public double getSubTotal(){
        double sum = 0.0;
        for (Item i: lineItems
             ) {
                sum += i.getPrice();
        }
        return sum;
    }
}
