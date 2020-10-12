package space.alex.freeman.factory.simple;

public class GreekPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing a greek pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking a greek pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting a greek pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing a greek pizza");
    }
}
