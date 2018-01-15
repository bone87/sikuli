package MVC;

import BuilderSimple.Car;

public class DbModel implements Model {
    @Override
    public Car getCar() {
        return new Car();
    }
}
