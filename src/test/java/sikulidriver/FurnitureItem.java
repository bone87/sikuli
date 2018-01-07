package sikulidriver;


public class FurnitureItem {
    private SikuliElement itemImage;
    private SikuliElement itemOnWorkPlaceImage;
    private SikuliElement deleteItemFromWorkPlaceImage;

    public FurnitureItem(SikuliElement itemImage, SikuliElement itemOnWorkPlaceImage, SikuliElement deleteItemFromWorkPlaceImage) {
        this.itemImage = itemImage;
        this.itemOnWorkPlaceImage = itemOnWorkPlaceImage;
        this.deleteItemFromWorkPlaceImage = deleteItemFromWorkPlaceImage;
    }

    SikuliElement getItemImage() {
        return itemImage;
    }

    SikuliElement getItemOnWorkPlaceImage() {
        return itemOnWorkPlaceImage;
    }

    SikuliElement getDeleteItemFromWorkPlaceImage() {
        return deleteItemFromWorkPlaceImage;
    }
}
