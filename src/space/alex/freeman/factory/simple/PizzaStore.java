package space.alex.freeman.factory.simple;

public class PizzaStore {
    private SimplePizzaFactory pizzaFactory;

    public PizzaStore(SimplePizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
        pizzaStore.orderPizza("cheese");
        pizzaStore.orderPizza("veggie");
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = pizzaFactory.createPizza(type) ;
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
