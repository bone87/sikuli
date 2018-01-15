package BuilderWithDirector;

import BuilderSimple.Transmission;

public class SubaruImprezzaBuilder extends CarBuilder {
    @Override
    void buildMake() {
        car.setMake("Subaru Imprezza");
    }

    @Override
    void buildTransmission() {
        car.setTransmission(Transmission.MANUAL);
    }

    @Override
    void buildSpeed() {
        car.setSpeed(290);
    }
}
