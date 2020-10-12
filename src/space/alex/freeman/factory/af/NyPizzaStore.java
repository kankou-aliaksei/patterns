package space.alex.freeman.factory.af;

public class NyPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        PizzaIngredientFactory ingredientFactory = new NyPizzaIngredientFactory();
        Pizza pizza;
        switch (type) {
            case "cheese":
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("New York Cheese Pizza");
                break;
            case "greek":
                pizza = new GreekPizza(ingredientFactory);
                pizza.setName("New York greek Pizza");
                break;
            default:
                throw new RuntimeException("This kind of a pizza is not exist");
        }
        return pizza;
    }
}
