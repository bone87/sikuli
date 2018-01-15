package BuilderSimple;

public class CarBuilder {
    private String make = "Default";
    private Transmission transmission = Transmission.MANUAL;
    private int speed = 125;

    public CarBuilder setMake(String make) {
        this.make = make;
        return this;
    }

    public CarBuilder setTransmission(Transmission transmission) {
        this.transmission = transmission;
        return this;
    }

    public CarBuilder setSpeed(int speed) {
        this.speed = speed;
        return this;
    }

    public Car buildCar() {
        Car car = new Car();
        car.setMake(make);
        car.setTransmission(transmission);
        car.setSpeed(speed);
        return car;
    }
}
