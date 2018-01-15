package Observer;

import java.util.ArrayList;
import java.util.List;

public class MeteoStation implements Observed{
    private int temp;
    private int pressure;

    public void setMeasuremts(int temp, int pressure) {
        this.temp = temp;
        this.pressure = pressure;
        notifyObservers();
    }

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observers) {
            observer.handleEvent(temp, pressure);
        }
    }
}
