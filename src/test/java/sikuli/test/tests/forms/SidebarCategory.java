package sikuli.test.tests.forms;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.Button;

public class SidebarCategory extends BaseForm {

    private final String btnCategoryStringLocator = "//a[@id='%s']";

    public SidebarCategory(String sideBarCategoryName) {
        super(By.xpath(String.format("//div[@class='facet-category']//ul[@class='selected']//a[text()='%s']", sideBarCategoryName)), String.format("sidebar category: %s", sideBarCategoryName));
    }

    private void openCategory(Button btnCategory) {
        btnCategory.waitForIsElementPresent();
        btnCategory.clickAndWait();
    }

    /**
     * Select 'Dining room' and check if items has appeared"
     **/
    public void openDiningRoomCategory() {
        Button btnCategory = new Button(By.xpath(String.format(btnCategoryStringLocator, "new-1849")), String.format("link with id=%s", "new-1849"));
        openCategory(btnCategory);
    }

}
