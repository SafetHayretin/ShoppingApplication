/**
 * Products class with name and price
 */

public class Product {

    private String name;

    private double price;

    public Product(String name, double price) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name can't be empty!");
        }
        if (price < 0) {
            throw new IllegalArgumentException("Price can't be negative!");
        }
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}