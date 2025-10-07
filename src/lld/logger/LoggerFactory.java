package lld.logger;

import java.util.Arrays;

public class LoggerFactory {

    public static Logger createConsoleLogger(LogLevel level) {
        return new SimpleLogger(Arrays.asList(new ConsoleLogDestination()), new SimpleLogFormatter(), level);
    }

    public static Logger createFileLogger(LogLevel level, String filePath) {
        return new SimpleLogger(Arrays.asList(new FileLogDestination(filePath)), new SimpleLogFormatter(), level);
    }

    public static Logger createMultiLogger(LogLevel level, String filePath) {
        return new SimpleLogger(Arrays.asList(new ConsoleLogDestination(), new FileLogDestination(filePath)), new SimpleLogFormatter(), level);
    }
}
