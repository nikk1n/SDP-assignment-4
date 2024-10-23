package Ex4;
//Concrete State
public class NewState implements State{
    @Override
    public void payOrder(Order order) {
        order.setState(new PaidState());
        System.out.println("Order is paid for successfully");
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("Can't ship an unpaid order");
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Can't deliver an unpaid order");
    }

    @Override
    public void cancelOrder(Order order) {
        order.setState(new CanceledState());
        System.out.println("Order is canceled");
    }
}
