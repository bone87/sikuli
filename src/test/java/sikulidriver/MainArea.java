package sikulidriver;

import sikuli.test.tests.SikuliTest;

public class MainArea {
    private final String PROPERTY_NAME_PATH_TO_PIC_FOLDER = "path_to_pic_folder";
    private final String PATH_TO_PIC_FOLDER = SikuliTest.props.getProperty(PROPERTY_NAME_PATH_TO_PIC_FOLDER);
    private final SikuliElement tableItem = new SikuliElement(String.format(PATH_TO_PIC_FOLDER,"item.png"), "item 'table'");
    private final SikuliElement screenCenter = new SikuliElement(String.format(PATH_TO_PIC_FOLDER,"center.png"), "screen center");
    private final SikuliElement btnClose = new SikuliElement(String.format(PATH_TO_PIC_FOLDER,"btnClose.png"), "button close");
    private final SikuliElement itemOnWorkSpace = new SikuliElement(String.format(PATH_TO_PIC_FOLDER,"verifyDrop.png"), "item on work space");

    /**
     * Drag 'tableItem' and drop to 'screenCenter'
     **/
    public void dropTableToCenter() {
        tableItem.dragItem();
        tableItem.dropItemAt(screenCenter.getItem());
    }

    /**
     * Clicking at 'itemOnWorkSpace'
     **/
    public void selectItemOnWorkSpace() {
        itemOnWorkSpace.clickItem();
    }

    /**
     * Delete 'itemOnWorkSpace' - clicking 'btnClose'
     **/
    public void deteteItem() {
        btnClose.clickItem();
    }

    /**
     * Check if 'itemOnWorkSpace' is displayed on work space
     **/
    public boolean isItemMovedToWorkSpace() {
        return itemOnWorkSpace.isItemDisplay();
    }


}
