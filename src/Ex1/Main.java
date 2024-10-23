package Ex1;
//Usage example
public class Main {
    public static void main(String[] args) {
        ShoppingCart cart=new ShoppingCart();
        cart.setStrategy(new CreditCardPayment());
        cart.process(34523.5);
        cart.setStrategy(new CryptoPayment());
        cart.process(654.3);
        cart.setStrategy(new PayPalPayment());
        cart.process(7689.5);

    }
}
