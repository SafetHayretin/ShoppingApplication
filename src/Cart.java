import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Cart {
    private static final DecimalFormat df = new DecimalFormat("0.00");

    private List<CartItem> items = new ArrayList<>();

    private int deliveryFee = calculateDeliveryFee();

    private double itemsSumPrice = 0;

    public void classProperties(){
        for (CartItem item : items) {
            item.displayProductType();
        }
        System.out.println("Delivery fee: " + deliveryFee);
    }

    public double calculateVat(){
        calculateItemsPrice();
        return itemsSumPrice * 1.2;
    }

    public void calculateItemsPrice(){
        for (CartItem item : items) {
            itemsSumPrice += item.calculateTotalPrice();
        }
    }

    public int calculateDeliveryFee(){
        if(calculateVat()<100){
            return 10;
        }
        if(calculateVat()< 200){
            return 5;
        }
        return 0;
    }

    public void displayFinalPrice(){
        System.out.println("Final price: " +df.format( calculateVat() + deliveryFee));
    }

    public void addProduct(CartItem item){
        items.add(item);
    }

    public void removeProduct(CartItem item){
        items.remove(item);
    }
}
