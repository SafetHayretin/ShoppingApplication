import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Shows everything in our cart
 * Calculates total price
 * From total price calculates VAT
 * Calculates our delivery fee
 * After calculating everything, displays all products in cart and their quantity
 * Displays delivery fee and total cost
 */

public class Cart {

    private static final DecimalFormat formatSecondDigit = new DecimalFormat("0.00");

    private final double vatPercentage = 0.2;

    private List<CartItem> items = new ArrayList<>();

    /**
     * Calculates all products price before taxes
     */
    public double calculateItemsPrice() {
        double itemsSumPrice = 0;
        for (CartItem item : items) {
            itemsSumPrice += item.calculateTotalPrice();
        }
        return itemsSumPrice;
    }

    /**
     * Calculates VAT from total price
     */
    public double calculateVat() {
        return calculateItemsPrice() * vatPercentage;
    }

    /**
     * Calculates delivery fee
     */
    public int calculateDeliveryFee() {
        double priceWithTaxes = calculateItemsPrice() + calculateVat();
        if (priceWithTaxes < 100) {
            return 10;
        }
        if (priceWithTaxes < 200) {
            return 5;
        }
        return 0;
    }

    /**
     * Adds product to our cart
     */
    public void addProduct(CartItem item) {
        items.add(item);
    }

    /**
     * Removes products from our cart
     */
    public void removeProduct(CartItem item) {
        items.remove(item);
    }

    /**
     * Displays all items in cart, delivery price, and final price after taxes
     */
    @Override
    public String toString() {
        String itemsInCart = "";
        for (CartItem item : items) {
            itemsInCart = itemsInCart.concat(item.toString());
        }
        return "Items in cart: \n" + itemsInCart + '\n' +
                "Delivery fee: " + calculateDeliveryFee() + '\n' +
                "Final price: " + formatSecondDigit.format(calculateItemsPrice() + calculateVat() + calculateDeliveryFee());
    }
}
