package sikuli.test.tests;

import sikuli.test.tests.forms.MainForm;
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
        logger.info("Open menu 'Furnish your room'");
        mainForm.sidebar.openFurnishYourRoom();

        logger.step(4);
        logger.info("Go to 'Dining room'");
        mainForm.sidebar.category.openDiningRoomCategory();
    }
}
