package space.alex.freeman.factory.method;

public class NyGreekPizza extends Pizza {
    public NyGreekPizza() {
        super("NY greek pizza", "ny tough greek pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing a greek pizza");
    }
}
