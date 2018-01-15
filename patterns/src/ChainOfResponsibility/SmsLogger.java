package ChainOfResponsibility;

public class SmsLogger extends Logger {

    public SmsLogger(int prioriry) {
        super(prioriry);
    }

    @Override
    void log(String message) {
        System.out.println("SMS: "+message);
    }
}
