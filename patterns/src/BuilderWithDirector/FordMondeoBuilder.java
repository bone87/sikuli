package BuilderWithDirector;

import BuilderSimple.Transmission;

public class FordMondeoBuilder extends CarBuilder {
    @Override
    void buildMake() {
        car.setMake("Ford Mondeo");
    }

    @Override
    void buildTransmission() {
        car.setTransmission(Transmission.AUTO);
    }

    @Override
    void buildSpeed() {
        car.setSpeed(250);
    }
}
