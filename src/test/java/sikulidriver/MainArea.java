package sikulidriver;

import sikuli.test.tests.SikuliTest;

public class MainArea {
    private final String PROPERTY_NAME_PATH_TO_PIC_FOLDER = "path_to_pic_folder";
    private final String PATH_TO_PIC_FOLDER = SikuliTest.props.getProperty(PROPERTY_NAME_PATH_TO_PIC_FOLDER);
    private final SikuliElement tableItem = new SikuliElement(PATH_TO_PIC_FOLDER.concat("item.png"), "item 'table'");
    private final SikuliElement screenCenter = new SikuliElement(PATH_TO_PIC_FOLDER.concat("center.png"), "screen center");
    private final SikuliElement btnClose = new SikuliElement(PATH_TO_PIC_FOLDER.concat("btnClose.png"), "button close");
    private final SikuliElement itemOnWorkSpace = new SikuliElement(PATH_TO_PIC_FOLDER.concat("verifyDrop.png"), "item on work space");

    /**
     * Drag 'tableItem' and drop to 'screenCenter'
     **/
    public void dropTableToCenter() {
        System.out.println(String.format(PATH_TO_PIC_FOLDER,"item.png"));
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
