package space.alex.freeman.facade.hometheater;

public class HomeTheaterFacade {
    private DvdPlayer dvdPlayer;
    private Light light;

    public HomeTheaterFacade(DvdPlayer dvdPlayer, Light light) {
        this.dvdPlayer = dvdPlayer;
        this.light = light;
    }

    public void watchMovie(String movie) {
        light.off();
        dvdPlayer.on();
        dvdPlayer.inject();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        dvdPlayer.stop();
        dvdPlayer.extract();
        dvdPlayer.off();
        light.on();
    }
}
