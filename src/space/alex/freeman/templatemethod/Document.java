package space.alex.freeman.templatemethod;

public abstract class Document {
    protected String name;

    public Document(String name) {
        this.name = name;
    }

    public void open() {
        System.out.println(name + " is opened");
    }

    public abstract void read();
}
