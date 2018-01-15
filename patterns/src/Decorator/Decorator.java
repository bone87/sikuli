package Decorator;

public abstract class Decorator {
    protected Printer component;

    public Decorator(Printer component) {
        this.component = component;
    }
}
