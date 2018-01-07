package sikuli.test.tests;

import org.testng.Assert;
import sikuli.test.tests.forms.MainForm;
import sikuli.test.tests.forms.ProductProperties;
import sikuli.test.tests.forms.SceneProperties;
import sikuli.test.tests.utils.ConfigReader;
import sikulidriver.MainArea;
import webdriver.BaseTest;

public class SikuliTest extends BaseTest {
    @Override
    public void runTest() {

        logger.step(1);
        logger.info("Go to 'https://roomstyler.com/3dplanner'");
        MainForm mainForm = new MainForm();

        logger.step(2);
        logger.info("Close the dialog window 'Welcome to roomstyler 3D home planner'");
        mainForm.welcomeWindow.closeWelcomeWindow();

        logger.step(3);
        logger.info(String.format("Open menu '%s'", ConfigReader.CATEGORY_NAME));
        mainForm.sidebar.openCategory(ConfigReader.CATEGORY_NAME, ConfigReader.getSubCategoryId());

        logger.step(4);
        logger.info(String.format("Go to '%s'", ConfigReader.SUB_CATEGORY_NAME));
        mainForm.sidebar.category.openCategory(ConfigReader.getSubCategoryId());

        logger.step(5);
        logger.info("Select drag and drop item and move to the work space");
        MainArea mainArea = new MainArea(ConfigReader.PATH_TO_PIC_FOLDER);
        mainArea.dropTableToCenter();

        logger.step(6);
        logger.info("Check for element is correctly displayed on the work space");
        Assert.assertTrue(mainArea.isItemMovedToWorkSpace(), "Item hasn't displayed on work space");

        logger.step(7);
        logger.info("Click the element and check data");
        mainArea.selectItemOnWorkSpace();
        ProductProperties productProperties = new ProductProperties();
        productProperties.assertProductPropertiesAreNotEmpty();

        logger.step(8);
        logger.info("Delete element");
        mainArea.deteteItem();
        SceneProperties sceneProperties = new SceneProperties();
        sceneProperties.assertSceneItemsAreEmpty();
    }
}
