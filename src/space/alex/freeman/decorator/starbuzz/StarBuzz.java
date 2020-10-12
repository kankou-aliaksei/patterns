package space.alex.freeman.decorator.starbuzz;

public class StarBuzz {
    public static void main(String[] args) {
        Beverage beverage = new Whip(new Whip(new Milk(new Espresso())));
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
    }
}
