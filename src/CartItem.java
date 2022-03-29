public class CartItem {
    private Product product;
    private int quantity;

    public CartItem(Product product, int quantity){
        this.product = product;
        this.quantity = quantity;
    }

    public void displayProductType(){
        System.out.println("Product name: " + product.getProductName());
        System.out.println("Quantity: " + quantity);
    }

    public double calculateTotalPrice(){
        return product.getProductPrice() * quantity;
    }
}
