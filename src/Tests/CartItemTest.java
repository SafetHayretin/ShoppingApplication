package Tests;

import Application.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CartItemTest {
    @Test
    public void calculatedTotalPriceShouldBeHundredAndSixty() {
        //Given
        Product product = new Product("Star Wars", 80);
        CartItem item = new CartItem(product, 2);

        //When
        double calculatedPrice = item.calculateTotalPrice();

        //Then
        assertEquals(160, calculatedPrice);
    }

}