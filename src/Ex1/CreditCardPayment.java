package Ex1;

//Credit card Payment implementation
public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing a credit card payment of "+amount+"$");
    }
}
