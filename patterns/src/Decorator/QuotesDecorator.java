package Decorator;

public class QuotesDecorator extends Decorator implements Printer {
    public QuotesDecorator(Printer component) {
        super(component);
    }

    @Override
    public void print() {
        System.out.print("\"");
        component.print();
        System.out.print("\"");
    }
}
