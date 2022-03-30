public class Product {

    private String productName;

    private double productPrice;

    /**
     * Products class with name and price
     */
    public Product(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }
}
