package space.alex.freeman.singleton;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private static ChocolateBoiler boiler;
    //private static volatile ChocolateBoiler boiler;

    private ChocolateBoiler() {
        this.empty = true;
        this.boiled = false;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

    public static ChocolateBoiler getInstance() {
        System.out.println("The " + Thread.currentThread().getName() + " is inside");
        if (boiler == null) {
            System.out.println(Thread.currentThread().getName() + ". The boiler is null");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            boiler = new ChocolateBoiler();
        }
        return boiler;
    }

/*    public static ChocolateBoiler getInstance() {
        System.out.println("The " + Thread.currentThread().getName() + " is inside");
        if (boiler == null) {
            synchronized (ChocolateBoiler.class) {
                System.out.println(Thread.currentThread().getName() + ". starting synchronized block");
                if (boiler == null) {
                    System.out.println(Thread.currentThread().getName() + ". The boiler is null");
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    boiler = new ChocolateBoiler();
                } else {
                    System.out.println(Thread.currentThread().getName() + ". The boiler is not null");
                }
                System.out.println(Thread.currentThread().getName() + ". ending synchronized block");
            }
        }
        return boiler;
    }*/
}
