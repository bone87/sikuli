package Abstract_Factory;

public class HumanUnitFactory extends UnitFactory {
    @Override
    public Mage createMage() {
        return new HumanMage();
    }

    @Override
    public Archer createArcher() {
        return new HumanArcher();
    }

    @Override
    public Warrior createWarrior() {
        return new HumanWarrior();
    }
}
