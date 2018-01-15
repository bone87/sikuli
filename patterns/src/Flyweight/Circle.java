package Flyweight;

public class Circle implements Shape {
    private int r = 10;
    @Override
    public void draw(int x, int y) {
        System.out.println(String.format("Draw CIRCLE with r=%d, [x=%d, y=%d] ", r, x, y) + this);
    }
}
