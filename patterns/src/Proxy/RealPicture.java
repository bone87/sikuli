package Proxy;

public class RealPicture implements Picture {

    private String path;

    public RealPicture(String path) {
        this.path = path;
        load();
    }

    private void load() {
        System.out.println("Pic load...");
    }
    @Override
    public void draw() {
        System.out.println("Pic draw...");
    }
}
