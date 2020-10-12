package space.alex.freeman.adapter.duck;

public class DuckTest {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        Duck turkeyAdapterByInheritance = new TurkeyAdapterByInheritance();
        turkey.fly();
        turkey.gobble();
        System.out.println();
        duckTest(duck);
        System.out.println();
        duckTest(turkeyAdapter);
        System.out.println();
        duckTest(turkeyAdapterByInheritance);
        System.out.println();
        Duck childTurkeyAdapter = new TurkeyAdapter(new ChildWildTurkey());
        duckTest(childTurkeyAdapter);
        System.out.println();
        Duck childTurkeyAdapterByInheritance = new ChildTurkeyByInheritance();
        duckTest(childTurkeyAdapterByInheritance);
    }

    public static void duckTest(Duck duck) {
        duck.fly();
        duck.quack();
    }
}
