package space.alex.freeman.observer.jdk;

import java.util.Observable;

public class WeatherData extends Observable {
    private float temperature;
    private float pressure;

    public void setMeasurements(float temperature, float pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
        setChanged();
        notifyObservers();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }
}
