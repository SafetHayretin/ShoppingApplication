package Tests;
import Application.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CartTest {
    @Test
    public void itemsInCartPriceShouldBeEighty(){
        //Given
        Product product = new Product("Fifa 22", 40);
        CartItem item = new CartItem(product, 2);
        Cart gta5 = new Cart();
        gta5.addProduct(item);

        //When
        double productPrice = gta5.calculateItemsPrice();

        //Then
        assertEquals(80, productPrice);
    }

    @Test
    public void vatPriceShouldBeTwelve(){
        //Given
        Product product = new Product("GTA 5", 60);
        CartItem item = new CartItem(product);
        Cart gta5 = new Cart();
        gta5.addProduct(item);

        //When
        double vat = gta5.calculateVat();

        //Then
        assertEquals(12, vat);
    }

    @Test
    public void deliveryFeeShouldBeTen(){
        //Given
        Product product = new Product("GTA 5", 60);
        CartItem item = new CartItem(product);
        Cart gta5 = new Cart();
        gta5.addProduct(item);

        //When
        double deliveryFee = gta5.calculateDeliveryFee();

        //Then
        assertEquals(10, deliveryFee);
    }

    @Test
    public void deliveryFeeShouldBeFive(){
        //Given
        Product product = new Product("Lego Star Wars", 120);
        CartItem item = new CartItem(product);
        Cart gta5 = new Cart();
        gta5.addProduct(item);

        //When
        double deliveryFee = gta5.calculateDeliveryFee();

        //Then
        assertEquals(5, deliveryFee);
    }

    @Test
    public void deliveryFeeShouldBeZero(){
        //Given
        Product product = new Product("GTA 5", 120);
        CartItem item = new CartItem(product, 2);
        Cart gta5 = new Cart();
        gta5.addProduct(item);

        //When
        double deliveryFee = gta5.calculateDeliveryFee();

        //Then
        assertEquals(0, deliveryFee);
    }


}