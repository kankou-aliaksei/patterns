package space.alex.freeman.command.remotecontrol.device;

public class CeilingFan {
    public static int HIGH = 3;
    public static int MEDIUM = 2;
    public static int LOW = 1;
    public static int OFF = 0;

    private int speed;

    public void high() {
        speed = HIGH;
        System.out.println("Ceiling fan is on high");
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println("Ceiling fan is on medium");
    }

    public void low() {
        speed = LOW;
        System.out.println("Ceiling fan is on low");
    }

    public void off() {
        speed = OFF;
        System.out.println("Ceiling fan is off");
    }

    public int getSpeed() {
        return speed;
    }
}
