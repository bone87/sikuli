package sikuli.test.tests.forms;

import org.openqa.selenium.By;
import webdriver.BaseForm;

public class MainForm extends BaseForm {

    public Sidebar sidebar = new Sidebar();
    public WelcomeWindow welcomeWindow = new WelcomeWindow();

    public MainForm() {
        super(By.xpath("//div[@id='popin-content-holder']"), "main page");
    }

}
