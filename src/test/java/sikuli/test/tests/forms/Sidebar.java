package sikuli.test.tests.forms;

import org.openqa.selenium.By;
import org.testng.Assert;
import sikuli.test.tests.SikuliTest;
import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.Label;

public class Sidebar extends BaseForm {
    private static final String CATEGORY_NAME= "category_name";
    public SidebarCategory category;
    public Button btnCategory;
    private final String btnCategoryStringLocator = "//div[@id='sidebar']//a[@title='%s']";

    public Sidebar() {
        super(By.xpath("//div[@id='sidebar']"), "sidebar");
    }

    /**
     * Open category
     * @param btnCategory
     * @param sidebarCategoryName
     */
    private void openCategory(Button btnCategory, String sidebarCategoryName) {
        btnCategory.waitForIsElementPresent();
        btnCategory.clickAndWait();
        category = new SidebarCategory(sidebarCategoryName);
    }

    /**
     * Open category 'Furnish your room'.
     */
    public void openFurnishYourRoom() {
        btnCategory = new Button(By.xpath(String.format(btnCategoryStringLocator, System.getProperty(SikuliTest.SIKULI_PROPERTIES_FILE, CATEGORY_NAME))),
                String.format("category: %s", "furnish your room"));
        openCategory(btnCategory,"Dining room");
    }

}

