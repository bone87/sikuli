package sikuli.test.tests.forms;

import org.openqa.selenium.By;
import sikuli.test.tests.SikuliTest;
import webdriver.BaseForm;
import webdriver.elements.Button;

public class SidebarCategory extends BaseForm {

    private final String LINK_ID;

    private final String btnCategoryStringLocator = "//a[@id='%s']";

    public SidebarCategory(String sub_category_link_id) {
        super(By.xpath(String.format("//a[@id='%s']", sub_category_link_id)), String.format("sidebar category with link id=%s", sub_category_link_id));
        LINK_ID=sub_category_link_id;
    }

    private void openCategory(Button btnCategory) {
        btnCategory.waitForIsElementPresent();
        btnCategory.clickAndWait();
    }

    /**
     * Select 'Dining room' and check if items has appeared"
     **/
    public void openDiningRoomCategory() {
        Button btnCategory = new Button(By.xpath(String.format(btnCategoryStringLocator, LINK_ID)), String.format("link with id=%s", LINK_ID));
        openCategory(btnCategory);
    }

}
