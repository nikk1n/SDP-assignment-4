package Ex4;
//Concrete State
public class CanceledState implements State{
    @Override
    public void payOrder(Order order) {
        System.out.println("This order is canceled");
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("This order is canceled");
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("This order is canceled");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("This order is already canceled");
    }
}
