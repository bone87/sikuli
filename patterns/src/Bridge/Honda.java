package Bridge;

public class Honda implements Make {
    @Override
    public void getMakeInfo() {
        System.out.println("HONDA");
    }
}
