package Tests;

import Application.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CartItemTest {

    @Test
    public void calculatedTotalPriceShouldBeHundredAndSixty() {
        //given
        Product product = new Product("Star Wars", 80);
        CartItem item = new CartItem(product, 2);

        //when
        double calculatedPrice = item.calculateTotalPrice();

        //then
        assertEquals(160, calculatedPrice);
    }

}