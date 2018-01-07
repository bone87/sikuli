package sikuli.test.tests;

import org.testng.Assert;
import sikuli.test.tests.forms.MainForm;
import sikuli.test.tests.forms.ProductProperties;
import sikuli.test.tests.forms.SceneProperties;
import sikulidriver.MainArea;
import webdriver.BaseTest;
import webdriver.PropertiesResourceManager;

public class SikuliTest extends BaseTest {
    private static final String SIKULI_PROPERTIES_FILE = "sikuli_project.properties";
    private final PropertiesResourceManager props = new PropertiesResourceManager(SIKULI_PROPERTIES_FILE);

    private final String PROPERTY_NAME_CATEGORY_NAME = "category_name";
    private final String PROPERTY_NAME_SUB_CATEGORY_LINK_ID = "sub_category_link_id";
    private final String PROPERTY_NAME_PATH_TO_PIC_FOLDER = "path_to_pic_folder";
    private final String CATEGORY_NAME = props.getProperty(PROPERTY_NAME_CATEGORY_NAME);
    private final String LINK_ID = props.getProperty(PROPERTY_NAME_SUB_CATEGORY_LINK_ID);
    private final String PATH_TO_PIC_FOLDER = props.getProperty(PROPERTY_NAME_PATH_TO_PIC_FOLDER);

    @Override
    public void runTest() {

        logger.step(1);
        logger.info("Go to 'https://roomstyler.com/3dplanner'");
        MainForm mainForm = new MainForm();

        logger.step(2);
        logger.info("Close the dialog window 'Welcome to roomstyler 3D home planner'");
        mainForm.welcomeWindow.btnClose.clickAndWait();

        logger.step(3);
        logger.info("Open menu 'Furnish your room'");
        mainForm.sidebar.openCategory(CATEGORY_NAME, LINK_ID);

        logger.step(4);
        logger.info("Go to 'Dining room'");
        mainForm.sidebar.category.openCategory(LINK_ID);

//        logger.step(5);
//        logger.info("Select drag and drop item and move to the work space");
//        MainArea mainArea = new MainArea(PATH_TO_PIC_FOLDER);
//        mainArea.dropTableToCenter();
//
//        logger.step(6);
//        logger.info("Check for element is correctly displayed on the work space");
//        Assert.assertTrue(mainArea.isItemMovedToWorkSpace(), "Item hasn't displayed on work space");
//
//        logger.step(7);
//        logger.info("Click the element and check data");
//        mainArea.selectItemOnWorkSpace();
//        ProductProperties productProperties = new ProductProperties();
//        productProperties.assertProductPropertiesAreNotEmpty();
//
//        logger.step(8);
//        logger.info("Delete element");
//        mainArea.deteteItem();
//        SceneProperties sceneProperties = new SceneProperties();
//        sceneProperties.assertSceneItemsAreEmpty();
    }
}
