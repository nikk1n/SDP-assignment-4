package Ex3;
//Concrete Command
public class DimLights implements Command{
    private Lights lights;
    private int previousLevel;
    private int level;

    public DimLights(Lights lights, int level) {
        this.lights = lights;
        this.level = level;
    }

    @Override
    public void execute() {
        previousLevel=lights.getBrightness();
        lights.dim(level);
        System.out.println("Lights level: "+lights.getBrightness());
    }

    @Override
    public void undo() {
        lights.dim(previousLevel);
        System.out.println("Lights level: "+lights.getBrightness());
    }
}
