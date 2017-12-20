package sikuli.test.tests.forms;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import webdriver.BaseForm;
import webdriver.elements.Label;

public class SceneProperties extends BaseForm {

    private final String sceneItemCountStringLocator = "//div[@id='view-component-info']//div[@class='scene']//b[@class='%sCount']";
    private String[] itemsNames = {"walls", "doors", "windows", "components", "materials"};

    public SceneProperties() {
        super(By.xpath("//div[@id='view-component-info']//div[@class='scene']//b[@class='wallsCount']"), "scene properties");
    }

    /**
     * Returns count of scene item
     **/
    private int getSceneItemCount(String itemName) {
        return Integer.parseInt(new Label(By.xpath(String.format(sceneItemCountStringLocator, itemName)), String.format("%s count", itemName)).getText());
    }

    /**
     * Assert if scene items are empty.
     **/
    public void assertSceneItemsAreEmpty() {
        SoftAssert softAssert = new SoftAssert();
        for (String itemName : itemsNames) {
            int count = getSceneItemCount(itemName);
            softAssert.assertTrue(count == 0, String.format("Count = %s of scene item with name: '%s' isn't equal 0.", count, itemName));
        }
        softAssert.assertAll();
    }
}
