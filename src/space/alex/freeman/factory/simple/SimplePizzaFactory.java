package space.alex.freeman.factory.simple;

public class SimplePizzaFactory {
    Pizza createPizza(String type) {
        Pizza pizza;
        switch (type) {
            case "cheese":
                pizza = new CheesePizza();
                break;
            case "pepperoni":
                pizza = new PepperoniPizza();
                break;
                /*
            case "greek":
                pizza = new GreekPizza();
                break;*/
            case "veggie":
                pizza = new VeggiePizza();
                break;
            default:
                throw new RuntimeException("This kind of a pizza is not exist");
        }
        return pizza;
    }
}
