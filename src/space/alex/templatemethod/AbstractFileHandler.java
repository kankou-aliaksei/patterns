package space.alex.templatemethod;

public abstract class AbstractFileHandler {

    public void handle() {
        load();
        parse();
        send();
    }

    abstract void load();

    abstract void parse();

    abstract void send();
}
