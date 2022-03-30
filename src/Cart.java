import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Cart {
    private static final DecimalFormat formatSecondDigit = new DecimalFormat("0.00");

    private List<CartItem> items = new ArrayList<>();

    //Displays all items in cart, delivery price, and final price after taxes
    @Override
    public String toString() {
        System.out.println("Items in cart:");
        for (CartItem item : items) {
            System.out.println(item.toString());
        }
        System.out.println("Delivery fee: " + calculateDeliveryFee());
        System.out.println("Final price: " + formatSecondDigit.format(calculateItemsPrice() + calculateVat() + calculateDeliveryFee()));
        return null;
    }

    //calculates VAT from total price
    public double calculateVat() {
        return calculateItemsPrice() * 0.2;
    }

    //Calculates all products price before taxes
    public double calculateItemsPrice() {
        double itemsSumPrice = 0;
        for (CartItem item : items) {
            itemsSumPrice += item.calculateTotalPrice();
        }
        return itemsSumPrice;
    }

    //Calculates delivery fee
    public int calculateDeliveryFee() {
        if (calculateItemsPrice() + calculateVat() < 100) {
            return 10;
        }
        if (calculateItemsPrice() + calculateVat() < 200) {
            return 5;
        }
        return 0;
    }

    //Adds product to our cart
    public void addProduct(CartItem item) {
        items.add(item);
    }

    //Removes products from our cart
    public void removeProduct(CartItem item) {
        items.remove(item);
    }
}
