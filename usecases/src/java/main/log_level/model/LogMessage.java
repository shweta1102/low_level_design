package src.java.main.log_level.model;

import java.time.LocalDateTime;

public class LogMessage {
    String message;
    LocalDateTime time;
    LogLevel logLevel;

    public LogMessage(String message, LocalDateTime time, LogLevel logLevel) {
        this.message = message;
        this.time = time;
        this.logLevel = logLevel;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public LogLevel getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
