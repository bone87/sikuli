package Abstract_Factory;

public class UnitsCreator {
    public static UnitFactory createUnits(String raсe) {
        switch (raсe) {
            case "Human": return new HumanUnitFactory();
            case "Elf": return new ElfUnitFactory();
            default: throw new RuntimeException("Unsuppored race");
        }
    }
}
