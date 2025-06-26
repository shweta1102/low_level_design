package src.java.main.log_level.service.formatter;

import src.java.main.log_level.model.LogLevel;
import src.java.main.log_level.model.LogMessage;

public interface Formatter {
    String format(LogMessage message);
}
