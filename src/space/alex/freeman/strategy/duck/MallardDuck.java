package space.alex.freeman.strategy.duck;

import space.alex.freeman.strategy.fly.FlyBehavior;
import space.alex.freeman.strategy.quack.QuackBehavior;

public class MallardDuck extends Duck {

    public MallardDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    @Override
    public void display() {
        System.out.println("Displaying the mallard duck");
    }
}
