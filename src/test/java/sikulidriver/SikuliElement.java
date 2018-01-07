package sikulidriver;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;

class SikuliElement {
    private final String pathToPic;
    private final Screen screen = new Screen();

    SikuliElement(String pathToPic) {
        this.pathToPic = pathToPic;
    }

    /**
     * Find item and return
     **/
    Region getItem() {
        try {
            return screen.find(pathToPic);
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
            return null;
        }
    }

    /**
     * Drag item
     **/
    void dragItem() {
        try {
            getItem().drag(pathToPic);
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
    }

    /**
     * Drop item to another item
     **/
    void dropItemAt(Region item) {
        try {
            getItem().dropAt(item);
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
    }

    /**
     * Click to item
     **/
    void clickItem() {
        getItem().click();
    }

    /**
     * Check if item is displayed
     **/
    boolean isItemDisplay() {
        return getItem() != null;

    }
}
