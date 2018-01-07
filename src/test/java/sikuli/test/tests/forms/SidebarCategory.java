package sikuli.test.tests.forms;

import org.openqa.selenium.By;
import sikuli.test.tests.SikuliTest;
import webdriver.BaseForm;
import webdriver.elements.Button;

public class SidebarCategory extends BaseForm {

    private final String btnCategoryStringLocator = "//a[@id='%s']";

    public SidebarCategory(String subCategoryLinkId) {
        super(By.xpath(String.format("//a[@id='%s']", subCategoryLinkId)), String.format("sidebar category with link id=%s", subCategoryLinkId));
    }

    /**
     * Open subcategory
     */
    public void openCategory(String categoryLinkId) {
        Button btnCategory = new Button(By.xpath(String.format(btnCategoryStringLocator, categoryLinkId)), String.format("link with id=%s", categoryLinkId));
        btnCategory.clickAndWait();
    }


}
