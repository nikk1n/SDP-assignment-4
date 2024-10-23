package Ex6;
import java.util.ArrayList;
import java.util.List;
//Mediator
public class ChatRoom implements ChatMediator{
    private List<User> users=new ArrayList<>();

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(String message, User sender) {
        for(User user:users){
            if(user!=sender){
                user.receiveMessage(message);
            }
        }
    }
}
