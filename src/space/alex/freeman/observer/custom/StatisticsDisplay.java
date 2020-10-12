package space.alex.freeman.observer.custom;

public class StatisticsDisplay implements Observer, Display {
    private Subject subject;
    private float maxTemp;
    private float minTemp = 200;
    private float tempSum;
    private int numReadings;

    public StatisticsDisplay(Subject subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    @Override
    public void update(Subject subject) {
        float temperature = ((WeatherData) subject).getTemperature();
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
}
