package space.alex.strategy.multicontext;

public class StrategyRunner {
    private static IFileManager fileManager;

    public static void setFileHandler(IFileManager fileManager) {
        StrategyRunner.fileManager = fileManager;
    }

    public static void main(String[] args) {
        //setFileHandler(new SimpleFileManager(new FirstFileHandler()));
        //setFileHandler(new SimpleFileManager(new SecondFileHandler()));
        //setFileHandler(new ConfirmationFileManager(new FirstFileHandler(), new EmailSender()));
        setFileHandler(new ConfirmationFileManager(new SecondFileHandler(), new EmailSender()));
        fileManager.manage();
    }
}
