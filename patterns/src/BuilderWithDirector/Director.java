package BuilderWithDirector;

import BuilderSimple.Car;

public class Director {
    private CarBuilder carBuilder;

    public void setCarBuilder(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public Car buildCar() {
        carBuilder.createCar();
        carBuilder.buildMake();
        carBuilder.buildTransmission();
        carBuilder.buildSpeed();
        return carBuilder.getCar();
    }
}
