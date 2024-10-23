package Ex3;
//Usage
public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl=new RemoteControl();
        TV tv=new TV();
        Stereo stereo=new Stereo();
        Lights lights=new Lights();
        remoteControl.setCommands(0,new TurnTVOn(tv));
        remoteControl.setCommands(1,new SetVolume(stereo,20));
        remoteControl.setCommands(2,new SetVolume(stereo,80));
        remoteControl.setCommands(3,new DimLights(lights,30));
        remoteControl.setCommands(4,new DimLights(lights,90));
        System.out.println("Default:");
        System.out.println("TV turned on: "+tv.isTurnedOn()+" \nLights level: "+lights.getBrightness()+" \nStereo volume: "+stereo.getVolume());
        System.out.println("\nExecuting commands:");
        remoteControl.pressButton(0);
        remoteControl.pressButton(1);
        remoteControl.pressUndo();
        remoteControl.pressButton(4);
        remoteControl.pressButton(3);
        remoteControl.pressUndo();

    }
}
