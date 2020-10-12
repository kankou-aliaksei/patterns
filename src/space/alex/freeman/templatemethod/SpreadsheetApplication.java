package space.alex.freeman.templatemethod;

public class SpreadsheetApplication extends Application {

    @Override
    public Document createDocument(String name) {
        return new SpreadsheetDocument(name);
    }

    @Override
    protected boolean canOpenDocument(String name) {
        return true;
    }
}
