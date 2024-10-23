package Ex2;

public class WeatherData {
    public static void main(String[] args) {
        WeatherStation station=new WeatherStation();
        station.addDisplay(new CurrentConditionsDisplay());
        station.addDisplay(new StatisticsDisplay());
        station.addDisplay(new ForecastDisplay());
        System.out.println("First weather update:");
        station.setWeatherData(22.0f,65.4f,1013.6f);
        System.out.println("\nSecond weather update:");
        station.setWeatherData(29.3f,89.5f,1014.6f);
        System.out.println("\nThird weather update:");
        station.setWeatherData(24.0f,78.4f,1456.6f);
    }
}
