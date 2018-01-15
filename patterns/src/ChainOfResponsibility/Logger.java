package ChainOfResponsibility;

public abstract class Logger {
    private Logger next;
    private int prioriry;

    public void setNext(Logger next) {
        this.next = next;
    }

    Logger(int prioriry) {
        this.prioriry = prioriry;
    }

    public void logMessage(String message, int level) {
        if (prioriry<=level) log(message);
        if (next !=null) next.logMessage(message, level);
    }

    abstract void log(String message);
}
