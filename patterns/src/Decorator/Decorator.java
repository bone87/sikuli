package Decorator;

public abstract class Decorator implements Printer{
    protected Printer component;

    public Decorator(Printer component) {
        this.component = component;
    }
}
