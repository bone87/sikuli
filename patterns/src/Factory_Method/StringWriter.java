package Factory_Method;

public class StringWriter extends AbstractWriter {
    private Object object;

    StringWriter(Object object) {
        this.object = object;
    }

    @Override
    public void write() {
        System.out.println("wtite to String: "+ object);
    }
}
