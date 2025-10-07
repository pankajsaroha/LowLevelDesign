package lld.logger;

public interface LogFormatter {
    String format(LogLevel logLevel, String message);
}
