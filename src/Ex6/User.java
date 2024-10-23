package Ex6;
//Colleague Interface
abstract class User {
    protected ChatMediator chat;
    protected String name;
    public User(String name,ChatMediator chat){
        this.name=name;
        this.chat=chat;
        chat.addUser(this);
    }
    public abstract void sendMessage(String message);
    public abstract void receiveMessage(String message);
}
