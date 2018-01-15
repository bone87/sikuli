package Abstract_Factory;

public class HumanArcher implements Archer {
    @Override
    public void shoot() {
        System.out.println("Human is shooting...");
    }
}
