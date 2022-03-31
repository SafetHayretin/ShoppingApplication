/**
 * Takes product type and quantity and calculating total price.
 */

public class CartItem {

    private Product product;

    private int quantity;

    public CartItem(Product product, int quantity) {
        if (product == null) {
            throw new IllegalArgumentException("Product doesn't exist!");
        }
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity can't be zero or negative!");
        }
        this.product = product;
        this.quantity = quantity;
    }

    public CartItem(Product product) {
        this(product, 1);
    }

    /**
     * Calculates price with quantity
     */
    public double calculateTotalPrice() {
        return product.getPrice() * quantity;
    }

    @Override
    public String toString() {
        return "Product name: " + product.getName() + "\nQuantity: " + quantity + '\n';
    }
}
