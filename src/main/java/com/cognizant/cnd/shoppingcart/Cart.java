package com.cognizant.cnd.shoppingcart;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    List<Item> lineItems = new ArrayList<>();

    public void AddItem(Item item){
        lineItems.add(item);
    }

    public int itemCount(){
        return -2;
    }
}
