package Decorator;

public class RightBracketDecorator extends Decorator implements Printer {

    public RightBracketDecorator(Printer component) {
        super(component);
    }

    @Override
    public void print() {
        component.print();
        System.out.print("]");
    }
}
