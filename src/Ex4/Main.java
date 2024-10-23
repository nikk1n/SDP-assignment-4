package Ex4;
//Usage
public class Main {
    public static void main(String[] args) {
        Order regOrder=new Order();
        System.out.println("New order:");
        regOrder.deliver();
        regOrder.ship();
        regOrder.pay();
        regOrder.deliver();
        regOrder.ship();
        regOrder.deliver();
        regOrder.cancel();
        System.out.println("\nNew order:");
        Order cancelOrder=new Order();
        cancelOrder.pay();
        cancelOrder.cancel();
        cancelOrder.ship();
        cancelOrder.deliver();
        cancelOrder.cancel();
        cancelOrder.pay();
    }
}
