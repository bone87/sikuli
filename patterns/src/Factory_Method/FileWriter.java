package Factory_Method;

public class FileWriter extends AbstractWriter {
    private Object object;

    FileWriter(Object object) {
        this.object = object;
    }

    @Override
    public void write() {
        System.out.println("wtite to file: "+ object);

    }
}
