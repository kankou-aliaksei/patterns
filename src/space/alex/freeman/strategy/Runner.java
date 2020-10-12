package space.alex.freeman.strategy;

import space.alex.freeman.strategy.duck.Duck;
import space.alex.freeman.strategy.duck.MallardDuck;
import space.alex.freeman.strategy.duck.RedheadDuck;
import space.alex.freeman.strategy.duck.RubberDuck;
import space.alex.freeman.strategy.duck.WoodDuck;
import space.alex.freeman.strategy.fly.FlyNoWay;
import space.alex.freeman.strategy.fly.FlyWithWings;
import space.alex.freeman.strategy.huntingequipment.Decoy;
import space.alex.freeman.strategy.quack.Quack;
import space.alex.freeman.strategy.quack.QuackNoWay;
import space.alex.freeman.strategy.quack.Squeak;

public class Runner {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck(new FlyWithWings(), new Quack());
        mallardDuck.display();
        mallardDuck.swim();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        System.out.println("---");

        Duck redheadDuck = new RedheadDuck(new FlyWithWings(), new Squeak());
        redheadDuck.display();
        redheadDuck.swim();
        redheadDuck.performFly();
        redheadDuck.performQuack();

        System.out.println("---");

        Duck rubberDuck = new RubberDuck(new FlyNoWay(), new Quack());
        rubberDuck.display();
        rubberDuck.swim();
        rubberDuck.performFly();
        rubberDuck.performQuack();

        System.out.println("---");

        Duck woodDuck = new WoodDuck(new FlyNoWay(), new QuackNoWay());
        woodDuck.display();
        woodDuck.swim();
        woodDuck.performFly();
        woodDuck.performQuack();

        System.out.println("---");

        Decoy decoy = new Decoy(new Quack());
        decoy.performQuack();
    }
}
