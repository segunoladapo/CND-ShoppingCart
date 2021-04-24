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
    void testSubTotal() {
        double expected = 8.0;
        Item myItem = new Item("Fruits", 5.0,true);
        Item myItem2 = new Item("Glue", 3.0, true);
        cart.addAllItems(myItem, myItem2);
        assertEquals(expected, cart.getSubTotal());
    }

    @Test
    void testUpdateQuantity() {
        double expected = 2;
        Item myItem = new Item("Fruits", 5.0, true);
        Item myItem2 = new Item("Glue", 3.0, true);
        cart.addAllItems(myItem, myItem2);
        assertEquals(expected, cart.itemCount());
    }

    @Test
    void testHighLightedItem() {
        String expectedHighlighted = "[Fruits][Glue]";
        Item myItem = new Item("Fruits", 5.0, true);
        Item myItem2 = new Item("Glue", 3.0, true);
        Item myItem3 = new Item("GiftCard", 5.0, false);
        cart.addAllItems(myItem, myItem2, myItem3);
        assertEquals(expectedHighlighted, cart.printHighlighted());
    }

    @Test
    void testRemoveItem() {
        int count = 2;
        Item myItem = new Item("Fruits", 5.0, true);
        Item myItem2 = new Item("Glue", 3.0, true);
        Item myItem3 = new Item("GiftCard", 5.0, false);
        cart.addAllItems(myItem, myItem2, myItem3);
        cart.removeItem(myItem3);
        assertEquals(count, cart.itemCount());
    }

}
