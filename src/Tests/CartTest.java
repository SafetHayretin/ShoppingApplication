package Tests;
import Application.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {

    @Test
    public void cartPriceCalculatedCorrectly(){
        Product product = new Product("GTA 5", 59.99);
        CartItem item = new CartItem(product);
        Cart gta5 = new Cart();
        gta5.addProduct(item);
        Assertions.assertEquals(59.99, gta5.calculateItemsPrice());
    }

    @Test
    public void cartPriceShouldBe(){
        Product product = new Product("GTA 5", 60);
        CartItem item = new CartItem(product);
        Cart gta5 = new Cart();
        gta5.addProduct(item);
        //20% of 60
        Assertions.assertEquals(12, gta5.calculateVat());
    }

    @Test
    public void deliveryFeeShouldBeTen(){
        Product product = new Product("GTA 5", 60);
        CartItem item = new CartItem(product);
        Cart gta5 = new Cart();
        gta5.addProduct(item);
        Assertions.assertEquals(10, gta5.calculateDeliveryFee());
    }

    @Test
    public void deliveryFeeShouldBeFive(){
        Product product = new Product("GTA 5", 120);
        CartItem item = new CartItem(product);
        Cart gta5 = new Cart();
        gta5.addProduct(item);
        Assertions.assertEquals(5, gta5.calculateDeliveryFee());
    }

    @Test
    public void deliveryFeeShouldBeZero(){
        Product product = new Product("GTA 5", 120);
        CartItem item = new CartItem(product, 2);
        Cart gta5 = new Cart();
        gta5.addProduct(item);
        Assertions.assertEquals(0, gta5.calculateDeliveryFee());
    }


}