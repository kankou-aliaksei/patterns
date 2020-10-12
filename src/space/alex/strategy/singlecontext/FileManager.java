package space.alex.strategy.singlecontext;


public class FileManager {
    private IFileHandler fileHandler;

    public FileManager(IFileHandler fileHandler) {
        this.fileHandler = fileHandler;
    }

    public void manage() {
        System.out.println("Starting of loading the file");
        fileHandler.load();
        System.out.println("Starting of parsing the file");
        fileHandler.parse();
        System.out.println("Starting of sending the file");
        fileHandler.send();
    }
}
