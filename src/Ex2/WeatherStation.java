package Ex2;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
     private List<WeatherDisplay> displays=new ArrayList<>();
     private float temperature;
     private float humidity;
     private float pressure;
     public void addDisplay(WeatherDisplay display){
         this.displays.add(display);
     }
     public void removeDisplay(WeatherDisplay display){
         this.displays.remove(display);
     }
     public void updateDisplays(){
         for(WeatherDisplay  display:displays){
             display.update(temperature,humidity,pressure);
         }
     }
     public void setWeatherData(float temperature,float humidity,float pressure){
         this.temperature=temperature;
         this.humidity=humidity;
         this.pressure=pressure;
         updateDisplays();
     }
}
