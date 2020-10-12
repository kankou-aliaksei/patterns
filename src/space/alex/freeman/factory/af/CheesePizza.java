package space.alex.freeman.factory.af;

public class CheesePizza extends Pizza {
    private PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {
        dough = ingredientFactory.createDough();
        cheese = ingredientFactory.createCheese();
        System.out.println(String.format("Baking a %s", this));
    }
}
