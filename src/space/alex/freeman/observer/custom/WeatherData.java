package space.alex.freeman.observer.custom;

import java.util.LinkedList;
import java.util.List;

public class WeatherData implements Subject {
    private List<Observer> observers = new LinkedList<>();
    private float temperature;
    private float pressure;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(o -> o.update(this));
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public void setMeasurements(float temperature, float pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
        notifyObservers();
    }
}
