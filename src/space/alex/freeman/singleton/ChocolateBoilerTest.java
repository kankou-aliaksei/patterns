package space.alex.freeman.singleton;

public class ChocolateBoilerTest {
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println(ChocolateBoiler.getInstance());
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        t1.start();
        t2.start();
        //ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        //boiler.fill();
        //boiler.boil();
        //boiler.drain();
    }
}
