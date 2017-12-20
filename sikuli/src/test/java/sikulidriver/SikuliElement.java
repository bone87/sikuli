package sikulidriver;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;

public class SikuliElement {
    private final String pathToPic;
    private final String text;
    private final Screen screen = new Screen();

    public SikuliElement(String pathToPic, String text) {
        this.pathToPic = pathToPic;
        this.text = text;
    }

    /**
     * Find item and return
     **/
    public Region getItem() {
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
    public void dragItem() {
        try {
            getItem().drag(pathToPic);
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
    }

    /**
     * Drop item to another item
     **/
    public void dropItemAt(Region item) {
        try {
            getItem().dropAt(item);
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
    }

    /**
     * Click to item
     **/
    public void clickItem() {
        getItem().click();
    }

    /**
     * Check if item is displayed
     **/
    public boolean isItemDisplay() {
        try {
            getItem();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
