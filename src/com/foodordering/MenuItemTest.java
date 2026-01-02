package com.foodordering;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MenuItemTest {

    @Test
     void testPrice() {
        // 1. Create a burger for 9.99
        MenuItem burger = new MenuItem("Burger", 9.99);

        // 2. Check if the price is actually 9.99
        Assertions.assertEquals(9.99, burger.getPrice(), 0.001);
    }
}
