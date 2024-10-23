package Ex6;
//Concrete Colleague
public class RegularUser extends User{
    public RegularUser(String name, ChatMediator chat) {
        super(name, chat);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Premium user "+name+" sends a message: "+message);
        chat.sendMessage(message,this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Premium user "+name+" receives a message: "+message);
    }
}
