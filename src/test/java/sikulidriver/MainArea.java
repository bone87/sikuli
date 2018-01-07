package sikulidriver;

import org.testng.Assert;

public class MainArea {
    private SikuliElement tableItem;
    private SikuliElement screenCenter;
    private SikuliElement btnClose;
    private SikuliElement itemOnWorkSpace;

    public MainArea(String pathToPicFolder) {
        Assert.assertNotNull(pathToPicFolder, "Missing the path to pic folder");
        tableItem = new SikuliElement(pathToPicFolder.concat("item.png"));
        screenCenter = new SikuliElement(pathToPicFolder.concat("center.png"));
        btnClose = new SikuliElement(pathToPicFolder.concat("btnClose.png"));
        itemOnWorkSpace = new SikuliElement(pathToPicFolder.concat("verifyDrop.png"));
    }

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
