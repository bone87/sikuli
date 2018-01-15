package Observer;

public class ConsoleObserver implements Observer {
    @Override
    public void handleEvent(int temp, int pressure) {
        System.out.println(String.format("CONSOLE: temp=%d, pressure=%d",temp, pressure));
    }
}
