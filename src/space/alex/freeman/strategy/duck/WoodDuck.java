package space.alex.freeman.strategy.duck;

import space.alex.freeman.strategy.fly.FlyBehavior;
import space.alex.freeman.strategy.quack.QuackBehavior;

public class WoodDuck extends Duck {
    public WoodDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    @Override
    public void display() {
        System.out.println("Displaying the wood duck");
    }
}
