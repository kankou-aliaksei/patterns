package space.alex.freeman.decorator.starbuzz;

public class DarkRoast extends Beverage{
    public DarkRoast() {
        description = "dark roast";
    }

    @Override
    public double cost() {
        return 7;
    }
}
