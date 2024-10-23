package Ex4;
//Context
public class Order {
    private State state;
    public Order(){
        state=new NewState();
    }

    public void setState(State state) {
        this.state = state;
    }
    public void pay(){
        state.payOrder(this);
    }
    public void ship(){
        state.shipOrder(this);
    }
    public void deliver(){
        state.deliverOrder(this);
    }
    public void cancel(){
        state.cancelOrder(this);
    }

}
