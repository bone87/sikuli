package Abstract_Factory2;

public class TestAF {
    public static void main(String[] args) {
        ElementCreator elementCreator = new ElementCreator();
        ElementsFacroty macFactory = elementCreator.cteateElements("OsX");
        macFactory.createButton().click();
        macFactory.createLabel().write();
        ElementsFacroty winFactory = elementCreator.cteateElements("Windows");
        winFactory.createLabel().write();
        winFactory.createButton().click();
    }
}
