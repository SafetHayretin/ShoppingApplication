public class CartItem {
    private Product product;

    private int quantity;

    /**
     * Class with product type and quantity and calculating total price.
     */
    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product name: " + product.getProductName() + "\nQuantity: " + quantity;
    }

    //calculates Product price with quantity
    public double calculateTotalPrice() {
        return product.getProductPrice() * quantity;
    }
}
