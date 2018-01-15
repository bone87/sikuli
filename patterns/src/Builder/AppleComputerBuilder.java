package Builder;

public class AppleComputerBuilder extends ComputerBuilder{
    @Override
    public void buildSystemBlock() {
        computer.setSystemBlock("Apple System Block");
    }

    @Override
    public void buildDisplay() {
        computer.setDisplay("Apple Display");
    }

    @Override
    public void buildManipulators() {
        computer.setManipulators("Apple Manipulators");
    }

    @Override
    public String toString() {
        return "AppleComputerBuilder{" +
                "computer=" + computer +
                '}';
    }
}
