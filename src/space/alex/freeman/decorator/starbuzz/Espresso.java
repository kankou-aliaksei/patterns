package space.alex.freeman.decorator.starbuzz;

public class Espresso extends Beverage {
    public Espresso() {
        description = "espresso";
    }

    @Override
    public double cost() {
        return 5;
    }
}
