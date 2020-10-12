package space.alex.templatemethod;

public class FirstFileHandler extends AbstractFileHandler {

    @Override
    public void load() {
        System.out.println("Loading of the XML file from the FTP server");
    }

    @Override
    public void parse() {
        System.out.println("Parsing of the XML file");
    }

    @Override
    public void send() {
        System.out.println("Sending of the XML file to the table 1 into the DB");
    }
}
