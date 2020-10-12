package space.alex.freeman.observer.jdk;

import java.util.Observable;

public class CurrentConditionsDisplay implements UnsubscribableObserver, Display {
    private Observable observable;

    private float temperature;
    private float pressure;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println(String.format("temperature: %s | humidity: %s", temperature, pressure));
    }

    @Override
    public void update(Observable observable, Object arg) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) observable;
            temperature = weatherData.getTemperature();
            pressure = weatherData.getPressure();
        }
        display();
    }

    @Override
    public void unsubscribe() {
        observable.deleteObserver(this);
    }
}
