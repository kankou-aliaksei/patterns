package space.alex.freeman.factory.method;

public abstract class Pizza {
    private String name;
    private String dough;

    public Pizza(String name, String dough) {
        this.name = name;
        this.dough = dough;
    }

    public String getName() {
        return name;
    }

    final public void prepare() {
        System.out.println(String.format("Preparing a %s", getName()));
    }

    final public void bake() {
        System.out.println(String.format("Baking a %s", getName()));
    }

    final public void cut() {
        System.out.println(String.format("Cutting a %s", getName()));
    }

    public void box() {
        System.out.println(String.format("Boxing a %s", getName()));
    }
}
