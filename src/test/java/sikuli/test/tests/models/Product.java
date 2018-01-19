package sikuli.test.tests.models;

public class Product {
    private final String name;
    private final float width;
    private final float depth;
    private final float height;

    public Product(String name, float width, float depth, float height) {
        this.name = name;
        this.width = width;
        this.depth = depth;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public float getWidth() {
        return width;
    }

    public float getDepth() {
        return depth;
    }

    public float getHeight() {
        return height;
    }
}
