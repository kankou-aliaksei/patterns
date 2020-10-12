package space.alex.freeman.factory.af;

public class GreekPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public GreekPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {
        dough = ingredientFactory.createDough();
        cheese = ingredientFactory.createCheese();
        System.out.println(String.format("Baking a %s", this));
    }
}
