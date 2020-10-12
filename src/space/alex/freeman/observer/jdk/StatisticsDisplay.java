package space.alex.freeman.observer.jdk;

import java.util.Observable;

public class StatisticsDisplay implements UnsubscribableObserver, Display {
    private Observable observable;

    private float maxTemp;
    private float minTemp = 200;
    private float tempSum;
    private int numReadings;

    public StatisticsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object arg) {
        float temperature = ((WeatherData) observable).getTemperature();
        tempSum += temperature;
        numReadings++;

        if (temperature > maxTemp) {
            maxTemp = temperature;
        }

        if (temperature < minTemp) {
            minTemp = temperature;
        }

        display();
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp);
    }

    @Override
    public void unsubscribe() {
        observable.deleteObserver(this);
    }
}
