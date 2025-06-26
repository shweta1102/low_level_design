package src.java.main.log_level.service.appender;

import java.io.File;

public class LogFileAppender implements LogDestinationAppender {
    File logFile;

    public LogFileAppender(File logFile) {
        this.logFile = logFile;
    }

    @Override
    public void log(String message) {
        if (logFile.exists()) {
            System.out.println("Write the message in the file" + message);
        }
    }
}
