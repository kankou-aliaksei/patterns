package space.alex.templatemethod;

public class TemplateMethodRunner {
    private static AbstractFileHandler fileHandler;

    public static void setFileHandler(AbstractFileHandler fileHandler) {
        TemplateMethodRunner.fileHandler = fileHandler;
    }

    public static void main(String[] args) {
        //setFileHandler(new FirstFileHandler());
        setFileHandler(new SecondFileHandler());
        fileHandler.handle();
    }
}
