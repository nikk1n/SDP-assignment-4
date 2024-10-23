package Ex2;

public class StatisticsDisplay implements WeatherDisplay {
    private float temperatureSum;
    private int numUpdate;
    private float maxTemp=Float.MIN_VALUE;
    private float minTemp=Float.MAX_VALUE;

    @Override
    public void update(float temperature, float humidity, float pressure) {
        temperatureSum+=temperature;
        numUpdate++;
        if(maxTemp<temperature){
            maxTemp=temperature;
        }
        if(minTemp>temperature){
            minTemp=temperature;
        }
        float avgTemp=temperatureSum/numUpdate;
        System.out.println("Average temperature: "+avgTemp+" Max temperature: "+maxTemp+" Min temperature: "+minTemp);
    }
}
