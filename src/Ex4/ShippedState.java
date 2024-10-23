package Ex4;
//Concrete State
public class ShippedState implements State{
    @Override
    public void payOrder(Order order) {
        System.out.println("Order is already being shipped");
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("Order is already being shipped");
    }

    @Override
    public void deliverOrder(Order order) {
        order.setState(new DeliveredState());
        System.out.println("Order has been delivered");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Order is canceled");
    }

}
