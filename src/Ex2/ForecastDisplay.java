package Ex2;
//Concrete Observer
public class ForecastDisplay implements WeatherDisplay{
    private float lastHumidity;

    @Override
    public void update(float temperature, float humidity, float pressure) {
        String forecast;
        if(humidity==lastHumidity){
            forecast="Humidity will stay the same";
        }
        else if(humidity>lastHumidity){
            forecast="Humidity will increase";
        }
        else {
            forecast="Humidity will decrease";
        }
        lastHumidity=humidity;
        System.out.println(forecast);
    }
}
