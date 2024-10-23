package Ex3;
//Concrete Command
public class SetVolume implements Command{
    private Stereo stereo;
    private int previousVolume;
    private int volume;

    public SetVolume(Stereo stereo, int volume) {
        this.stereo = stereo;
        this.volume = volume;
    }

    @Override
    public void execute() {
        previousVolume=stereo.getVolume();
        stereo.setVolume(volume);
        System.out.println("Stereo volume: "+stereo.getVolume());
    }

    @Override
    public void undo() {
        stereo.setVolume(previousVolume);
        System.out.println("Stereo volume: "+stereo.getVolume());
    }
}
