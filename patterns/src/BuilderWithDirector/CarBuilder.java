package BuilderWithDirector;

import BuilderSimple.Car;

public abstract class CarBuilder {
    protected Car car;

    void createCar() {
        car = new Car();
    }

    public Car getCar() {
        return car;
    }

    abstract void buildMake();
    abstract void buildTransmission();
    abstract void buildSpeed();
}
