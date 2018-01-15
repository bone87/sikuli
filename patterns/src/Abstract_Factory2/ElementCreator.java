package Abstract_Factory2;

public class ElementCreator {
    public ElementsFacroty cteateElements(String os) {
        switch (os) {
            case "OsX": return new MacOsFactory();
            case "Windows": return new WinFactory();
            default: throw new RuntimeException("Incorrect OS name");
        }
    }
}
