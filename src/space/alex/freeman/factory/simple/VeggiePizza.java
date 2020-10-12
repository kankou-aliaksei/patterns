package space.alex.freeman.factory.simple;

public class VeggiePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing a veggie pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking a veggie pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting a veggie pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing a veggie pizza");
    }
}
