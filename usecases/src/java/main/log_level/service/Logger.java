package src.java.main.log_level.service;

import src.java.main.log_level.model.LogLevel;
import src.java.main.log_level.model.LogMessage;
import src.java.main.log_level.model.LoggerConfig;
import src.java.main.log_level.service.appender.LogConsoleAppender;
import src.java.main.log_level.service.formatter.BaseFormatter;

import java.time.LocalDateTime;

public class Logger {
    LoggerConfig loggerConfig;

    private Logger() {
        loggerConfig = new LoggerConfig(new LogConsoleAppender(), new BaseFormatter(), LogLevel.INFO);
    }

    public LoggerConfig getLoggerConfig() {
        return loggerConfig;
    }

    public void setLoggerConfig(LoggerConfig loggerConfig) {
        this.loggerConfig = loggerConfig;
    }

    private static class InstanceHolder {
        private static final Logger INSTANCE = new Logger();
    }

    public static Logger getInstance() {
        return InstanceHolder.INSTANCE;
    }

    public void log(String message, LogLevel level) {
        if (level.ordinal() <= loggerConfig.getLogLevel().ordinal()) {
            loggerConfig.getLogDestinationAppender().log(loggerConfig.getLogFormatter().format(new LogMessage(message, LocalDateTime.now(), level)));
        }
    }

    public void info(String message) {
        log(message, LogLevel.INFO);
    }

    public void debug(String message) {
        log(message, LogLevel.DEBUG);
    }

    public void warn(String message) {
        log(message, LogLevel.WARN);
    }

    public void error(String message) {
        log(message, LogLevel.ERROR);
    }
}
