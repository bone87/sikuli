package MVC;

public class Controller {
    private Model model = new DbModel();
    private View view = new ConsoleView();
    public void execure() {
        view.showCar(model.getCar());
    }
}
