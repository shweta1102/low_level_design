package src.java.main.log_level.service.appender;

public class LogConsoleAppender implements LogDestinationAppender {
    @Override
    public void log(String message) {
        System.out.println(message);
    }
}
