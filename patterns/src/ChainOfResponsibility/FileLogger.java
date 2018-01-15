package ChainOfResponsibility;

public class FileLogger extends Logger {

    public FileLogger(int prioriry) {
        super(prioriry);
    }

    @Override
    void log(String message) {
        System.out.println("FILE: "+message);
    }
}
