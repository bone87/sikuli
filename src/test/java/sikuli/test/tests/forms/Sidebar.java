package sikuli.test.tests.forms;

import org.openqa.selenium.By;
import org.testng.Assert;
import sikuli.test.tests.SikuliTest;
import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.Label;

public class Sidebar extends BaseForm {

    public SidebarCategory category;

    Sidebar() {
        super(By.xpath("//div[@id='sidebar']"), "sidebar");
    }

    /**
     * Open category.
     */
    public void openCategory(String categoryName, String subcategoryLinkId) {
        String btnCategoryStringLocator = "//div[@id='sidebar']//a[@title='%s']";
        Button btnCategory = new Button(By.xpath(String.format(btnCategoryStringLocator, categoryName)), String.format("category: %s", categoryName));
        btnCategory.clickAndWait();
        category = new SidebarCategory(subcategoryLinkId);
    }

}

