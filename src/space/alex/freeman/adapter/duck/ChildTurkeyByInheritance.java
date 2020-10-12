package space.alex.freeman.adapter.duck;

public class ChildTurkeyByInheritance extends ChildWildTurkey implements Duck {
    @Override
    public void quack() {
        gobble();
    }
}
