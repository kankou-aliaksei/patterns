package space.alex.freeman.observer.custom;

public class CurrentConditionsDisplay implements Observer, Display {
    private Subject subject;
    private float temperature;
    private float pressure;

    public CurrentConditionsDisplay(Subject subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println(String.format("temperature: %s | humidity: %s", temperature, pressure));
    }

    @Override
    public void update(Subject subject) {
        if (subject instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) subject;
            temperature = weatherData.getTemperature();
            pressure = weatherData.getPressure();
        }
        display();
    }
}
