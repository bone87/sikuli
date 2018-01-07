package sikuli.test.tests;

import sikuli.test.tests.forms.MainForm;
import sikuli.test.tests.forms.ProductProperties;
import sikuli.test.tests.forms.SceneProperties;
import sikuli.test.tests.utils.ConfigReader;
import sikuli.test.tests.models.FurnitureItem;
import sikulidriver.MainArea;
import sikulidriver.SikuliElement;
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
        FurnitureItem furnitureItem = new FurnitureItem(new SikuliElement(ConfigReader.PATH_TO_PIC_FOLDER + ConfigReader.ITEM_FILE_NAME),
                                      new SikuliElement(ConfigReader.PATH_TO_PIC_FOLDER + ConfigReader.VERIFY_DROP_FILE_NAME),
                                      new SikuliElement(ConfigReader.PATH_TO_PIC_FOLDER + ConfigReader.DELETE_ITEM_FILE_NAME));
        MainArea mainArea = new MainArea();
        mainArea.dropFurnitureItemToAreaCenter(furnitureItem);

        logger.step(6);
        logger.info("Check for element is correctly displayed on the work space");
        assertEquals("Item hasn't displayed on work space", mainArea.isItemMovedToWorkSpace(furnitureItem), true);

        logger.step(7);
        logger.info("Click the element and check data");
        mainArea.selectFurnitureItemOnWorkSpace(furnitureItem);
        ProductProperties productProperties = new ProductProperties();
        productProperties.assertProductPropertiesAreNotEmpty();

        logger.step(8);
        logger.info("Delete element");
        mainArea.deleteFurnitureItemFromWorkSpace(furnitureItem);
        SceneProperties sceneProperties = new SceneProperties();
        sceneProperties.assertSceneItemsAreEmpty();
        assertEquals("Item has displayed on work space", mainArea.isItemMovedToWorkSpace(furnitureItem), false);

    }
}
