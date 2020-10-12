package space.alex.strategy.singlecontext;

public class StrategyRunner {
    //private static FileManager fileManager = new FileManager(new FirstFileHandler());
    private static FileManager fileManager = new FileManager(new SecondFileHandler());

    public static void main(String[] args) {
        fileManager.manage();
    }
}
