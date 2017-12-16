package sikuli.test.tests.forms;

import org.openqa.selenium.By;
import org.testng.Assert;
import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.Label;

public class Sidebar extends BaseForm {

    public SidebarCategory category;
    public Button btnCategory;
    private final String btnCategoryStringLocator = "//div[@id='sidebar']//a[@title='%s']";

    public Sidebar() {
        super(By.xpath("//div[@id='sidebar']"), "sidebar");
    }


    /**
     * Open menu 'Furnish your room' and check if menu is opened
     **/
    private void openCategory(Button btnCategory, String sidebarCategoryName) {
        btnCategory.waitForIsElementPresent();
        btnCategory.clickAndWait();
        category = new SidebarCategory(sidebarCategoryName);
    }

    public void openFurnishYourRoom() {
        btnCategory = new Button(By.xpath(String.format(btnCategoryStringLocator, "Furnish your room")), String.format("category: %s", "furnish your room"));
        openCategory(btnCategory,"Dining room");
    }

}

