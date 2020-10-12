package space.alex.freeman.decorator.starbuzz;

public class Milk extends CondimentDecorator {
    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + 2;
    }
}
