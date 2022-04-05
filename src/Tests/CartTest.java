package Tests;
import Application.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {
    @Test
    public void itemsInCartPriceShouldBeEighty(){
        //given
        Product product = new Product("Fifa 22", 40);
        CartItem item = new CartItem(product, 2);
        Cart gta5 = new Cart();
        gta5.addProduct(item);

        //when
        double productPrice = gta5.calculateItemsPrice();

        //then
        Assertions.assertEquals(80, productPrice);
    }

    @Test
    public void vatPriceShouldBeTwelve(){
        //given
        Product product = new Product("GTA 5", 60);
        CartItem item = new CartItem(product);
        Cart gta5 = new Cart();
        gta5.addProduct(item);

        //when
        double vat = gta5.calculateVat();

        //then
        Assertions.assertEquals(12, vat);
    }

    @Test
    public void deliveryFeeShouldBeTen(){
        //given
        Product product = new Product("GTA 5", 60);
        CartItem item = new CartItem(product);
        Cart gta5 = new Cart();
        gta5.addProduct(item);

        //when
        double deliveryFee = gta5.calculateDeliveryFee();

        //then
        Assertions.assertEquals(10, deliveryFee);
    }

    @Test
    public void deliveryFeeShouldBeFive(){
        //given
        Product product = new Product("Lego Star Wars", 120);
        CartItem item = new CartItem(product);
        Cart gta5 = new Cart();
        gta5.addProduct(item);

        //when
        double deliveryFee = gta5.calculateDeliveryFee();

        //then
        Assertions.assertEquals(5, deliveryFee);
    }

    @Test
    public void deliveryFeeShouldBeZero(){
        //given
        Product product = new Product("GTA 5", 120);
        CartItem item = new CartItem(product, 2);
        Cart gta5 = new Cart();
        gta5.addProduct(item);

        //when
        double deliveryFee = gta5.calculateDeliveryFee();

        //then
        Assertions.assertEquals(0, deliveryFee);
    }


}