package sikuli.test.tests.models;


import sikulidriver.SikuliElement;

public class FurnitureItem {
    private SikuliElement itemImage;
    private SikuliElement itemOnWorkPlaceImage;
    private SikuliElement deleteItemFromWorkPlaceImage;

    public FurnitureItem(SikuliElement itemImage, SikuliElement itemOnWorkPlaceImage, SikuliElement deleteItemFromWorkPlaceImage) {
        this.itemImage = itemImage;
        this.itemOnWorkPlaceImage = itemOnWorkPlaceImage;
        this.deleteItemFromWorkPlaceImage = deleteItemFromWorkPlaceImage;
    }

    public SikuliElement getItemImage() {
        return itemImage;
    }

    public SikuliElement getItemOnWorkPlaceImage() {
        return itemOnWorkPlaceImage;
    }

    public SikuliElement getDeleteItemFromWorkPlaceImage() {
        return deleteItemFromWorkPlaceImage;
    }
}
