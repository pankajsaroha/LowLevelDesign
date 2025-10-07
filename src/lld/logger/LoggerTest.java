package lld.logger;

public class LoggerTest {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.createConsoleLogger(LogLevel.INFO);
        logger.log(LogLevel.INFO, "This is an info message");
        logger.log(LogLevel.ERROR, "This is an error message");
    }
}
