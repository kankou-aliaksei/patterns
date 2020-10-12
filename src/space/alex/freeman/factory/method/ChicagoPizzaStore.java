package space.alex.freeman.factory.method;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;
        switch (type) {
            case "cheese":
                pizza = new ChicagoCheesePizza();
                break;
            case "greek":
                pizza = new ChicagoGreekPizza();
                break;
            default:
                throw new RuntimeException("This kind of a pizza is not exist");
        }
        return pizza;
    }
}
