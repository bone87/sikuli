package sikuli.test.tests.forms;

import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;
import webdriver.BaseForm;
import webdriver.elements.Label;

enum SceneItem {
    walls, doors, windows, components, materials;

    /**
     * Returns count of item
     **/
    int getSceneItemCount() {
        String sceneItemCountStringLocator = "//div[@id='view-component-info']//div[@class='scene']//b[@class='%sCount']";
        return Integer.parseInt(new Label(By.xpath(String.format(sceneItemCountStringLocator, this)), String.format("%s count", this)).getText());
    }

}

public class SceneProperties extends BaseForm {

    public SceneProperties() {
        super(By.xpath("//div[@id='view-component-info']//div[@class='scene']//b[@class='wallsCount']"), "scene properties");
    }

    /**
     * Assert if scene items are empty.
     **/
    public void assertSceneItemsAreEmpty() {
        SoftAssert softAssert = new SoftAssert();
        for (SceneItem sceneItemName : SceneItem.values()) {
            int count = sceneItemName.getSceneItemCount();
            softAssert.assertTrue(count == 0, String.format("Count = %s of scene item with name: '%s' isn't equal 0.", count, sceneItemName));
        }
        softAssert.assertAll();
    }
}
