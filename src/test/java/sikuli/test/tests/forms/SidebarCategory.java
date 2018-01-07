package sikuli.test.tests.forms;

import org.openqa.selenium.By;
import sikuli.test.tests.SikuliTest;
import webdriver.BaseForm;
import webdriver.elements.Button;

public class SidebarCategory extends BaseForm {
    private static final String BTN_SUB_CATEGORY_STRING_LOCATOR = "//a[@id='%s']";
    SidebarCategory(String subCategoryName) {
        super(By.xpath(String.format(BTN_SUB_CATEGORY_STRING_LOCATOR, subCategoryName)), String.format("sidebar category with link id=%s", subCategoryName));
    }

    /**
     * Open subcategory
     */
    public void openCategory(String subCategoryLinkId) {
        Button btnCategory = new Button(By.xpath(String.format(BTN_SUB_CATEGORY_STRING_LOCATOR, subCategoryLinkId)), String.format("link with id=%s", subCategoryLinkId));
        btnCategory.clickAndWait();
    }

}
