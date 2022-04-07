package Tests;

import Application.Product;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    @Test
    public void productShouldThrowExceptionWhenNameIsNull(){
        //Given
        String name = null;
        double price = 59.99;

        //When
        Executable productTrowsIllegalArgument = () -> new Product(name, price);

        //Then
        assertThrows(IllegalArgumentException.class, productTrowsIllegalArgument, "Product name can't be null!");
    }

    @Test
    public void productShouldThrowExceptionWhenNameIsBlank(){
        //Given
        String name = "";
        double price = 59.99;

        //When
        Executable productTrowsIllegalArgument = () -> new Product(name, price);

        //Then
        assertThrows(IllegalArgumentException.class, productTrowsIllegalArgument, "Product name can't be empty!");
    }

    @Test
    public void productShouldThrowExceptionWhenPriceIsNegative(){
        //Given
        String name = "Fifa 22";
        double price = -25;

        //When
        Executable productTrowsIllegalArgument = () -> new Product(name, price);

        //Then
        assertThrows(IllegalArgumentException.class, productTrowsIllegalArgument, "Product price can't be negative!");
    }


}