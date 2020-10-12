package space.alex.freeman.factory.af;

public class PizzaRunner {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NyPizzaStore();
        pizzaStore.orderPizza("cheese");
        pizzaStore = new ChicagoPizzaStore();
        pizzaStore.orderPizza("cheese");
        pizzaStore.orderPizza("greek");
    }
}
