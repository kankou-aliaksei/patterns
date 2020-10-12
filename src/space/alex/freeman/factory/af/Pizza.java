package space.alex.freeman.factory.af;

public abstract class Pizza {
    String name;
    Dough dough;
    Cheese cheese;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void prepare();

    final public void bake() {
        System.out.println(String.format("Baking a %s", getName()));
    }

    final public void cut() {
        System.out.println(String.format("Cutting a %s", getName()));
    }

    public void box() {
        System.out.println(String.format("Boxing a %s", getName()));
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", cheese=" + cheese +
                '}';
    }
}
