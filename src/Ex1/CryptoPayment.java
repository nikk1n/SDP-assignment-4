package Ex1;

//Payment with crypto implementation
public class CryptoPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing a crypto payment of "+amount+"$");
    }
}
