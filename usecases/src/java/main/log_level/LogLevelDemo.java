package src.java.main.log_level;

import src.java.main.log_level.service.Logger;

public class LogLevelDemo {
    public static void main(String[] args) throws Exception {
        Logger logger = Logger.getInstance();
        logger.info("check info");
        logger.debug("check debug");
        logger.warn("check warn");
        logger.error("check error");
    }
}
