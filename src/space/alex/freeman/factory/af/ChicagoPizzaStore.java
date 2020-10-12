package space.alex.freeman.factory.af;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
        Pizza pizza;
        switch (type) {
            case "cheese":
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("Chicago Cheese Pizza");
                break;
            case "greek":
                pizza = new GreekPizza(ingredientFactory);
                pizza.setName("Chicago greek Pizza");
                break;
            default:
                throw new RuntimeException("This kind of a pizza is not exist");
        }
        return pizza;
    }
}
