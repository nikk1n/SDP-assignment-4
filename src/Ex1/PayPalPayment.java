package Ex1;

//PayPal payment implementation
public class PayPalPayment implements PaymentStrategy{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing a PayPal payment of "+amount+"$");
    }
}
