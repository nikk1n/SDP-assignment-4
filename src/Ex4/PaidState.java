package Ex4;
//Concrete State
public class PaidState implements State{
    @Override
    public void payOrder(Order order) {
        System.out.println("Order is already paid for");
    }

    @Override
    public void shipOrder(Order order) {
        order.setState(new ShippedState());
        System.out.println("Order is being shipped now");
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Not shipped order can't be delivered");
    }

    @Override
    public void cancelOrder(Order order) {
        order.setState(new CanceledState());
        System.out.println("Order is canceled");
    }
}
