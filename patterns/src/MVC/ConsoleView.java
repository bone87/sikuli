package MVC;

import BuilderSimple.Car;

public class ConsoleView implements View {
    @Override
    public void showCar(Car car) {
        System.out.println(car);
    }
}
