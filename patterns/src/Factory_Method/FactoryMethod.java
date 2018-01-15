package Factory_Method;

import java.io.File;

public class FactoryMethod {
    public AbstractWriter getWriter(Object object) {
        AbstractWriter writer = null;
        if (object instanceof String) writer = new StringWriter(object);
            else if (object instanceof File) writer = new FileWriter(object);
    return writer;
    }
}
