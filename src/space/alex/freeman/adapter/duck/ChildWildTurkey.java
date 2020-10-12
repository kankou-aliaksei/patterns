package space.alex.freeman.adapter.duck;

public class ChildWildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Child gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying child turkey");
    }
}
