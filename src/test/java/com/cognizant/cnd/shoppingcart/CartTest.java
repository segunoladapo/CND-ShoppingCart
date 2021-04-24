package com.cognizant.cnd.shoppingcart;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CartTest {

    Cart cart = null;

    @BeforeEach
    void setUpBeforeClass() throws Exception {
        this.cart = new Cart();
    }

    @Test
    void testThatCartIsEmpty() {
        int expected = 0;
        assertEquals(expected, cart.itemCount());
    }
    @Test
    void testSubTotal(){
        double expected = 8.0;
        Item myItem = new Item("Fruits",5.0);
        Item myItem2 = new Item("Glue",3.0);
        cart.addAllItems(myItem,myItem2);
        assertEquals(expected,cart.getSubTotal());
    }
}
