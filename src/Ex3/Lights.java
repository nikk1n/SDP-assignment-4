package Ex3;
//Receiver
public class Lights {
    private int brightness=100;
    public void dim(int level){
        this.brightness=level;
    }

    public int getBrightness() {
        return brightness;
    }
}
