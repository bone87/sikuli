package Abstract_Factory2;

public class WinFactory implements ElementsFacroty {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Label createLabel() {
        return new WinLabel();
    }
}
