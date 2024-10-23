package Ex3;
//Concrete Command
public class TurnTVOn implements Command{
    private TV tv;

    public TurnTVOn(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
        System.out.println("TV turned on: "+tv.isTurnedOn());
    }

    @Override
    public void undo() {
        tv.off();
        System.out.println("TV turned on: "+tv.isTurnedOn());
    }
}
