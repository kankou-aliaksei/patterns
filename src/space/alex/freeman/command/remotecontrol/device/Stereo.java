package space.alex.freeman.command.remotecontrol.device;

public class Stereo {
    public void on() {
        System.out.println("Stereo is on");
    }
    public void off() {
        System.out.println("Stereo is off");
    }
    public void setCd() {
        System.out.println("Stereo is set for CD input");
    }
    public void setDvd() {
        System.out.println("Stereo is set for DVD input");
    }
    public void setRadio() {
        System.out.println("Stereo is set for Radio input");
    }
    public void setVolume(int volume) {
        System.out.println("Stereo volume set to " + volume);
    }
}
