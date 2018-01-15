package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    private static final Map<String, Shape> shapes = new HashMap<>();

    public Shape getShape(String shapeName) {
        Shape shape = shapes.get(shapeName);
        if (shape==null) {
            switch (shapeName) {
                case "Circle":
                    shape = new Circle();
                    break;
                case "Square":
                    shape = new Square();
                    break;
                case "Line":
                    shape = new Line();
                    break;
                default: throw new RuntimeException("Incorrect shape name");
            }
            shapes.put(shapeName, shape);
        }
        return shape;
    }
}
