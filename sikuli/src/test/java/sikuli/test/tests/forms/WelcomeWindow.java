package sikuli.test.tests.forms;

import org.openqa.selenium.By;
import org.testng.Assert;
import webdriver.BaseForm;
import webdriver.elements.Button;

public class WelcomeWindow extends BaseForm {

    public final Button btnClose = new Button(By.xpath("//div[@id='popin-content-holder']/a[@class='popin-close-title']"), "close window");

    public WelcomeWindow() {
        super(By.xpath("//div[@id='popin-content-holder']"), "welcome window");
    }

}
