package sikuli.test.tests;

import org.testng.Assert;
import sikuli.test.tests.forms.MainForm;
import sikuli.test.tests.forms.ProductProperties;
import sikuli.test.tests.forms.SceneProperties;
import sikulidriver.MainArea;
import webdriver.BaseTest;
import webdriver.PropertiesResourceManager;

public class SikuliTest extends BaseTest {
    public static final String SIKULI_PROPERTIES_FILE = "sikuli_project.properties";
    public static final PropertiesResourceManager props = new PropertiesResourceManager(SIKULI_PROPERTIES_FILE);

    @Override
    public void runTest() {

        logger.step(1);
        logger.info("Go to 'https://roomstyler.com/3dplanner'");
        MainForm mainForm = new MainForm();

        logger.step(2);
        logger.info("Close the dialog window 'Welcome to roomstyler 3D home planner'");
        mainForm.welcomeWindow.closeWelcomeWindow();

        logger.step(3);
        logger.info("Open menu 'Furnish your room'");
        mainForm.sidebar.openFurnishYourRoom();

        logger.step(4);
        logger.info("Go to 'Dining room'");
        mainForm.sidebar.category.openDiningRoomCategory();

//        logger.step(5);
//        logger.info("Select drag and drop item and move to the work space");
//        MainArea mainArea = new MainArea();
//        mainArea.dropTableToCenter();
//
//        logger.step(6);
//        Assert.assertTrue(mainArea.isItemMovedToWorkSpace(), "Item hasn't displayed on work space");
//
//        logger.step(7);
//        mainArea.selectItemOnWorkSpace();
//        ProductProperties productProperties = new ProductProperties();
//        productProperties.assertProductPropertiesAreNotEmpty();
////        mainArea.selectItemOnWorkSpace();
//
//        logger.step(8);
//        mainArea.deteteItem();
//        SceneProperties sceneProperties = new SceneProperties();
//        sceneProperties.assertSceneItemsAreEmpty();
    }
}
