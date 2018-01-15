package Composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements IShape {
    private List<IShape> components = new ArrayList<>();

    public void addComponent(IShape component) {
        components.add(component);
    }

    public void removeComponent(IShape component) {
        components.remove(component);
    }

    @Override
    public void draw() {
        for (IShape IShape : components) {
            IShape.draw();
        }
    }
}
