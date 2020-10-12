package space.alex.strategy.multicontext;


public class ConfirmationFileManager implements IFileManager {
    private IFileHandler fileHandler;
    private EmailSender emailSender;

    public ConfirmationFileManager(IFileHandler fileHandler, EmailSender emailSender) {
        this.fileHandler = fileHandler;
        this.emailSender = emailSender;
    }

    @Override
    public void manage() {
        System.out.println("Starting of loading a file");
        fileHandler.load();
        System.out.println("Starting of parsing a file");
        fileHandler.parse();
        System.out.println("Starting of sending a file");
        fileHandler.send();
        emailSender.send();
    }
}
