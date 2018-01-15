package Flyweight;

public class Line implements Shape {
    @Override
    public void draw(int x, int y) {
        System.out.println(String.format("Draw LINE, [x=%d, y=%d] ", x, y) + this);
    }
}
