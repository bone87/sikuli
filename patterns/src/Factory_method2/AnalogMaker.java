package Factory_method2;

public class AnalogMaker implements WatchMaker {
    @Override
    public Watch createWatch() {
        return new AnalogWatch();
    }
}
