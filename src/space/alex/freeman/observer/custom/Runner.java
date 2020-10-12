package space.alex.freeman.observer.custom;

public class Runner {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        Observer currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        Observer statisticsDisplay = new StatisticsDisplay(weatherData);
        weatherData.setMeasurements(1, 2);
        weatherData.setMeasurements(3, 4);

    }
}
