package space.alex.freeman.observer.jdk;

import java.util.Observable;
import java.util.Observer;

public class Runner {
    public static void main(String[] args) {
        Observable weatherData = new WeatherData();
        UnsubscribableObserver currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        UnsubscribableObserver statisticsDisplay = new StatisticsDisplay(weatherData);
        weatherData.addObserver(statisticsDisplay);
        weatherData.addObserver(currentConditionsDisplay);
        ((WeatherData) weatherData).setMeasurements(1, 2);
        ((WeatherData) weatherData).setMeasurements(3, 4);
        statisticsDisplay.unsubscribe();
        ((WeatherData) weatherData).setMeasurements(4, 7);
    }
}
