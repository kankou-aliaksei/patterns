package space.alex.freeman.templatemethod;

public class SpreadsheetDocument extends Document {
    public SpreadsheetDocument(String name) {
        super(name);
    }

    @Override
    public void read() {
        System.out.println("Reading " + name + " spreadsheet");
    }
}
