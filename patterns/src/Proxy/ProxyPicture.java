package Proxy;

public class ProxyPicture implements Picture{

    private String path;
    private RealPicture realPicture;

    public ProxyPicture(String path) {
        this.path = path;
    }

    @Override
    public void draw() {
        if (realPicture == null) {
            realPicture = new RealPicture(path);
        }
        realPicture.draw();
    }
}
