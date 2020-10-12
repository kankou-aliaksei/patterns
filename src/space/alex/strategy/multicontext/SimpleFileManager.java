package space.alex.strategy.multicontext;

public class SimpleFileManager implements IFileManager {
    private IFileHandler fileHandler;

    public SimpleFileManager(IFileHandler fileHandler) {
        this.fileHandler = fileHandler;
    }

    @Override
    public void manage() {
        System.out.println("Starting of loading a file");
        fileHandler.load();
        System.out.println("Starting of parsing a file");
        fileHandler.parse();
        System.out.println("Starting of sending a file");
        fileHandler.send();
    }
}
