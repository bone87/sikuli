package Abstract_Factory2;

public class MacOsFactory implements ElementsFacroty {
    @Override
    public MacButton createButton() {
        return new MacButton();
    }

    @Override
    public Label createLabel() {
        return new MacLabel();
    }
}
