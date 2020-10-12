package space.alex.templatemethod;

public class SecondFileHandler extends AbstractFileHandler {

    @Override
    public void load() {
        System.out.println("Loading of the txt file from the folder");
    }

    @Override
    public void parse() {
        System.out.println("Parsing of the txt file");
    }

    @Override
    public void send() {
        System.out.println("Sending of the txt file to the table 2 into the DB");
    }
}
