package src.java.main.log_level.model;

import src.java.main.log_level.service.appender.LogDestinationAppender;
import src.java.main.log_level.service.formatter.Formatter;

public class LoggerConfig {
    LogDestinationAppender logDestinationAppender;
    Formatter logFormatter;
    LogLevel logLevel;

    public LoggerConfig(LogDestinationAppender logDestinationAppender, Formatter logFormatter, LogLevel logLevel) {
        this.logDestinationAppender = logDestinationAppender;
        this.logFormatter = logFormatter;
        this.logLevel = logLevel;
    }

    public LogLevel getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel;
    }

    public LogDestinationAppender getLogDestinationAppender() {
        return logDestinationAppender;
    }

    public void setLogDestinationAppender(LogDestinationAppender logDestinationAppender) {
        this.logDestinationAppender = logDestinationAppender;
    }

    public Formatter getLogFormatter() {
        return logFormatter;
    }

    public void setLogFormatter(Formatter logFormatter) {
        this.logFormatter = logFormatter;
    }
}
