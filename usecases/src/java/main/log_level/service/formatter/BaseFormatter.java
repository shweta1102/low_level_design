package src.java.main.log_level.service.formatter;

import src.java.main.log_level.model.LogMessage;

public class BaseFormatter implements Formatter {
    @Override
    public String format(LogMessage message) {
        return String.format("[%1$s] [%2$s] [%3$s]", message.getLogLevel().toString(), message.getMessage(), message.getTime());
    }
}
