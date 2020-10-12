package space.alex.freeman.adapter.duck;

public class TurkeyAdapterByInheritance extends WildTurkey implements Duck {
    @Override
    public void quack() {
        gobble();
    }
}
