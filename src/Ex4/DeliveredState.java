package Ex4;
//Concrete State
public class DeliveredState implements State{
    @Override
    public void payOrder(Order order) {
        System.out.println("Order was already delivered");
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("Order was already delivered");
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Order was already delivered");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Can't cancel delivered order");
    }
}
