package Flyweight;

public class Square implements Shape {
    private int a = 10;
    @Override
    public void draw(int x, int y) {
        System.out.println(String.format("Draw SQUARE with side=%d, [x=%d, y=%d] ", a, x, y) + this);

    }
}
