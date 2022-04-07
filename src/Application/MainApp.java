package Application;

import Application.Cart;
import Application.CartItem;

public class MainApp {
    public static void main(String[] args) {

        Product gta = new Product("Fifa 22", 59.99);
        Product fifa = new Product("Fifa 22", 59.99);
        System.out.println(gta.equals(fifa));
    }
}
