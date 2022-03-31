package Tests;

import Application.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void getName() {
        Product product = new Product("Fifa 22", 45.55);
        assertEquals("Fifa 22", product.getName());
    }

    @Test
    void getPrice() {
        Product product = new Product("Fifa 22", 45.55);
        assertEquals(45.55, product.getPrice());
    }
}