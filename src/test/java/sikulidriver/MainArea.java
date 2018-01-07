package sikulidriver;

import sikuli.test.tests.utils.ConfigReader;

public class MainArea {
    private SikuliElement areaCenterImage = new SikuliElement(ConfigReader.PATH_TO_PIC_FOLDER + "mainAreaCenter.png");

    /**
     * Drag 'FurnitureItem' and drop to 'areaCenter'
     **/
    public void dropFurnitureItemToAreaCenter(FurnitureItem furnitureItem) {
        furnitureItem.getItemImage().dragItem();
        furnitureItem.getItemImage().dropItemAt(areaCenterImage.getItem());
    }

    /**
     * Clicking at 'FurnitureItemOnWorkSpace'
     **/
    public void selectFurnitureItemOnWorkSpace(FurnitureItem furnitureItem) {
        furnitureItem.getItemOnWorkPlaceImage().clickItem();
    }

    /**
     * Delete 'FurnitureItemOnWorkSpace' - clicking 'btnClose'
     **/
    public void deleteFurnitureItemFromWorkSpace(FurnitureItem furnitureItem) {
        furnitureItem.getDeleteItemFromWorkPlaceImage().clickItem();
    }

    /**
     * Check if 'itemOnWorkSpace' is displayed on work space
     **/
    public boolean isItemMovedToWorkSpace(FurnitureItem furnitureItem) {
        return furnitureItem.getItemImage().isItemDisplay();
    }
//
//
}
