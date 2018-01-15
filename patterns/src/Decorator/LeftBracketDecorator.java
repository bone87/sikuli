package Decorator;

public class LeftBracketDecorator extends Decorator implements Printer{

    public LeftBracketDecorator(Printer component) {
        super(component);
    }

    @Override
    public void print() {
        System.out.print("[");
        component.print();
    }
}
