package sikulidriver;

import org.testng.Assert;

public class MainArea {
    private String path_to_pic_folder;
    private SikuliElement tableItem = new SikuliElement(path_to_pic_folder.concat("item.png"), "item");
    private SikuliElement screenCenter = new SikuliElement(path_to_pic_folder.concat("center.png"), "screen center");
    private SikuliElement btnClose = new SikuliElement(path_to_pic_folder.concat("btnClose.png"), "button close");
    private SikuliElement itemOnWorkSpace = new SikuliElement(path_to_pic_folder.concat("verifyDrop.png"), "item on work space");

    public MainArea(String path_to_pic_folder) {
        Assert.assertNotNull(path_to_pic_folder, "Missing the path to pic folder");
        this.path_to_pic_folder = path_to_pic_folder;
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
