package space.alex.freeman.facade.hometheater;

public class DvdPlayer {
    void inject() {
        System.out.println("Injecting DVD");
    }

    public void on() {
        System.out.println("The DVD player is on");
    }

    public void off() {
        System.out.println("The DVD player is on");
    }

    void play(String movie) {
        System.out.println(String.format("Playing the %s", movie));
    }

    void stop() {
        System.out.println("DVD player is stopped");
    }

    public void extract() {
        System.out.println("Extracting DVD");
    }
}
