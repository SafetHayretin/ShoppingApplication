public class MainApp {

    public static void main(String[] args) {
        //list of our products
        Product[] products = new Product[5];
        products[0] = new Product("Elden ring", 59.99);
        products[1] = new Product("Fifa 22", 39.99);
        products[2] = new Product("GTA V", 34.99);
        products[3] = new Product("F1 2021", 17.99);
        products[4] = new Product("LEGO Star Wars", 120);

        //Selecting the quantity
        CartItem item = new CartItem(products[2], 2);
        CartItem item2 = new CartItem(products[4], 1);
        CartItem item3 = new CartItem(products[1], 1);

        //Adding items to cart
        Cart cart = new Cart();
        cart.addProduct(item);
        cart.addProduct(item2);
        cart.addProduct(item3);
        cart.toString();
    }

}
