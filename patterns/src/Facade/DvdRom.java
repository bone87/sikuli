package Facade;

public class DvdRom {
    private Boolean data = false;

    public Boolean getData() {
        return data;
    }

    void loadData() {
        data = true;
    }

    void unloadData() {
        data = false;
    }
}
