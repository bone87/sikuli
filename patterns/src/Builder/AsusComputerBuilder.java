package Builder;

public class AsusComputerBuilder extends ComputerBuilder {
    @Override
    public void buildSystemBlock() {
        computer.setSystemBlock("Asus System Block");
    }

    @Override
    public void buildDisplay() {
        computer.setDisplay("Asus Display");
    }

    @Override
    public void buildManipulators() {
        computer.setManipulators("Asus Manipulators");
    }

    @Override
    public String toString() {
        return "AsusComputerBuilder{" +
                "computer=" + computer +
                '}';
    }
}
