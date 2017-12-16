package sikulidriver;

public class MainArea {
    private final SikuliElement tableItem = new SikuliElement("src/test/resources/pic/item.png", "item 'table'");
    private final SikuliElement screenCenter = new SikuliElement("src/test/resources/pic/center.png", "screen center");
    private final SikuliElement btnClose = new SikuliElement("src/test/resources/pic/btnClose.png", "button close");
    private final SikuliElement itemOnWorkSpace = new SikuliElement("src/test/resources/pic/verifyDrop.png", "item on work space");

    /**
     * Drag 'tableItem'
     **/
    public void dragTable() {
        tableItem.dragItem();
    }

    /**
     * Drag 'tableItem' and drop to 'screenCenter'
     **/
    public void dropTableToCenter() {
        dragTable();
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
