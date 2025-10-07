package lld.logger;

import java.time.LocalDateTime;

public class SimpleLogFormatter implements LogFormatter {

    @Override
    public String format(LogLevel logLevel, String message) {
        return String.format("[%s] [%s] %s", LocalDateTime.now(), logLevel, message);
    }
}
