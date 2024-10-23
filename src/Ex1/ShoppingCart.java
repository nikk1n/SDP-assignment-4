package Ex1;
//Context
public class ShoppingCart {
    private PaymentStrategy strategy;
    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }
    public void process(double amount){
        strategy.processPayment(amount);
    }

}
