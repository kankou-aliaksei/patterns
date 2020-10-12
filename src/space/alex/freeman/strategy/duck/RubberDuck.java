package space.alex.freeman.strategy.duck;

import space.alex.freeman.strategy.fly.FlyBehavior;
import space.alex.freeman.strategy.quack.QuackBehavior;

public class RubberDuck extends Duck {
    public RubberDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    @Override
    public void display() {
        System.out.println("Displaying the rubber duck");
    }
}
