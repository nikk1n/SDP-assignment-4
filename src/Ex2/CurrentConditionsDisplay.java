package Ex2;

public class CurrentConditionsDisplay implements WeatherDisplay{
    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Current weather conditions: temperature: "+temperature+" humidity: "+humidity+" pressure: "+pressure);
    }
}
