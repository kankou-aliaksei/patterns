package space.alex.freeman.factory.af;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinDough();
    }

    @Override
    public Cheese createCheese() {
        return new ThinCheese();
    }
}
