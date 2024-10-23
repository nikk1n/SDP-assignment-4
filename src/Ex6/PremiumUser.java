package Ex6;
//Concrete Colleague
public class PremiumUser extends User{
    public PremiumUser(String name, ChatMediator chat) {
        super(name, chat);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Regular user "+name+" sends a message: "+message);
        chat.sendMessage(message,this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Regular user "+name+" receives a message: "+message);
    }
}
