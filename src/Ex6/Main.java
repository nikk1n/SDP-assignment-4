package Ex6;
//Usage
public class Main {
    public static void main(String[] args) {
        ChatMediator chat=new ChatRoom();
        User user1=new RegularUser("CoffeeGuy765",chat);
        User user2=new RegularUser("Vasiliy",chat);
        User user3=new PremiumUser("Richington", chat);
        User user4=new PremiumUser("OldGuy98",chat);
        user1.sendMessage("Hello!");
        user3.sendMessage("How are you?");
    }
}
