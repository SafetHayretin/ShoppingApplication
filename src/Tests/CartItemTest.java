package Tests;

import Application.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CartItemTest {

    @Test
    void calculateTotalPrice() {
        Product product = new Product("Star Wars", 80);
        CartItem item = new CartItem(product, 2);
        assertEquals(160, item.calculateTotalPrice());
    }
}