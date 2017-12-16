package sikuli.test.tests.forms;

import org.openqa.selenium.By;
import org.testng.Assert;
import sikuli.test.tests.SikuliTest;
import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.Label;

public class Sidebar extends BaseForm {
    private final String PROPERTY_NAME_CATEGORY_NAME= "category_name";
    private final String CATEGORY_NAME= SikuliTest.props.getProperty(PROPERTY_NAME_CATEGORY_NAME);
    private final String PROPERTY_NAME_SUB_CATEGORY_LINK_ID= "sub_category_link_id";
    private final String LINK_ID= SikuliTest.props.getProperty(PROPERTY_NAME_SUB_CATEGORY_LINK_ID);

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
        btnCategory = new Button(By.xpath(String.format(btnCategoryStringLocator, CATEGORY_NAME)),
                String.format("category: %s", CATEGORY_NAME));
        openCategory(btnCategory,LINK_ID);
    }

}

