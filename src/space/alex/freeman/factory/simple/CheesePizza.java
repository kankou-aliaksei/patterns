package space.alex.freeman.factory.simple;

public class CheesePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing a cheese pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking a cheese pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting a cheese pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing a cheese pizza");
    }
}
