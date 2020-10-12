package space.alex.freeman.factory.method;

public class NyPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;
        switch (type) {
            case "cheese":
                pizza = new NyCheesePizza();
                break;
            case "greek":
                pizza = new NyGreekPizza();
                break;
            default:
                throw new RuntimeException("This kind of a pizza is not exist");
        }
        return pizza;
    }
}
