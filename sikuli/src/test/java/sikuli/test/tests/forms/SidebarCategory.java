package sikuli.test.tests.forms;

import org.openqa.selenium.By;
import sikuli.test.tests.SikuliTest;
import webdriver.BaseForm;
import webdriver.elements.Button;

public class SidebarCategory extends BaseForm {

    private final String btnCategoryStringLocator = "//a[@id='%s']";

    public SidebarCategory(String sub_category_link_id) {
        super(By.xpath(String.format("//a[@id='%s']", sub_category_link_id)), String.format("sidebar category with link id=%s", sub_category_link_id));
    }

    /**
     * Open subcategory
     */
    public void openCategory(String category_link_id) {
        Button btnCategory = new Button(By.xpath(String.format(btnCategoryStringLocator, category_link_id)), String.format("link with id=%s", category_link_id));
        btnCategory.waitForIsElementPresent();
        btnCategory.clickAndWait();
    }


}
