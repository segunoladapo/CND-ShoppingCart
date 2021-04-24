package com.cognizant.cnd.shoppingcart;

import org.junit.jupiter.api.BeforeAll;
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
}
