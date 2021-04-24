package com.cognizant.cnd.shoppingcart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cart {
    List<Item> lineItems = new ArrayList<>();

    public void addItem(Item item) {
        lineItems.add(item);
    }

    public void addAllItems(Item... items) {
        lineItems.addAll(Arrays.asList(items));
    }

    public int itemCount() {
        return lineItems.size();
    }

    public double getSubTotal() {
        double sum = 0.0;
        for (Item i : lineItems
        ) {
            sum += i.getPrice() * i.getQuantity();
        }
        return sum;
    }

    public String printHighlighted() {
        String output = "";
        for (Item i : lineItems
        ) {
            if (i.isOnSale())
                output += "[" + i.getName() + "]";
        }
        return output;
    }

    public void removeItem(Item item){
        lineItems.remove(item);
    }

    public String getItemizedList(){
        String output = "";
        for (Item i:lineItems
             ) {
                output+= "[" + "Price :" + i.getPrice() +","+ "Quantity :" + i.getQuantity() + "]";
        }
        return output;
    }
}
