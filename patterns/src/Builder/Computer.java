package Builder;

class Computer {
    private String systemBlock = null;
    private String display = null;
    private String manipulators = null;

    public void setSystemBlock(String systemBlock) {
        this.systemBlock = systemBlock;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public void setManipulators(String manipulators) {
        this.manipulators = manipulators;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "systemBlock='" + systemBlock + '\'' +
                ", display='" + display + '\'' +
                ", manipulators='" + manipulators + '\'' +
                '}';
    }
}

abstract class ComputerBuilder {
    protected Computer computer;

    public Computer getComputer() {
        return computer;
    }

    public void createNewComputer() {
        computer = new Computer();
    }

    public abstract void buildSystemBlock();
    public abstract void buildDisplay();
    public abstract void buildManipulators();
}
