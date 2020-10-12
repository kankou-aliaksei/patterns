package space.alex.freeman.decorator.starbuzz;

public abstract class CondimentDecorator extends Beverage {
    protected Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public abstract String getDescription();

    @Override
    public abstract double cost();
}
