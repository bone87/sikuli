package Observer;

public class FileObserver implements Observer {

    @Override
    public void handleEvent(int temp, int pressure) {
        System.out.println(String.format("FILE: temp=%d, pressure=%d",temp, pressure));
    }
}
