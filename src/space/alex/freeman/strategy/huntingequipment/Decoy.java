package space.alex.freeman.strategy.huntingequipment;

import space.alex.freeman.strategy.quack.QuackBehavior;

public class Decoy {
    QuackBehavior quackBehavior;

    public Decoy(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void performQuack() {
        quackBehavior.quack();
    }
}
