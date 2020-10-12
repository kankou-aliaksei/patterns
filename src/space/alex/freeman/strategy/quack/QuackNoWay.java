package space.alex.freeman.strategy.quack;

public class QuackNoWay implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Not quack");
    }
}
