package space.alex.freeman.facade.hometheater;

public class HomeTheater {
    public static void main(String[] args) {
        DvdPlayer dvdPlayer = new DvdPlayer();
        Light light = new Light();

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(dvdPlayer, light);

        homeTheaterFacade.watchMovie("My movie");
        homeTheaterFacade.endMovie();
    }
}
