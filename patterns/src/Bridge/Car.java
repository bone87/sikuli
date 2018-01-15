package Bridge;

public abstract class Car {
    protected Make make;

    public void setMake(Make make) {
        this.make = make;
    }

    abstract protected void getCarInfo();
    public void getCarDetails() {
        make.getMakeInfo();
        getCarInfo();
    }
}
