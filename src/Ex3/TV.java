package Ex3;
//Receiver
public class TV {
    private boolean turnedOn=false;
    public void on(){
        turnedOn=true;
    }
    public void off(){
        turnedOn=false;
    }

    public boolean isTurnedOn() {
        return turnedOn;
    }
}
