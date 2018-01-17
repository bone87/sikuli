package Factory_method2;

public class Runner {
    public static void main(String[] args) {
        WatchMaker watchMaker = new DigitalMaker();
        watchMaker.createWatch().showTime();
    }
}
