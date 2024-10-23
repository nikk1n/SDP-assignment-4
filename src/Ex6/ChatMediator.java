package Ex6;
//Mediator Interface
public interface ChatMediator {
    void addUser(User user);
    void sendMessage(String message,User sender);
}
