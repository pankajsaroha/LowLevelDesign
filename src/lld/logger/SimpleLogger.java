package lld.logger;

import java.util.List;

public class SimpleLogger implements Logger {

    private List<LogDestination> logDestinations;
    private LogFormatter formatter;
    private LogLevel minLoglevel;

    public SimpleLogger(List<LogDestination> logDestinations, LogFormatter formatter, LogLevel minLogLevel) {
        this.logDestinations = logDestinations;
        this.formatter = formatter;
        this.minLoglevel = minLogLevel;
    }

    @Override
    public void log(LogLevel level, String message) {
        if (level.ordinal() >= minLoglevel.ordinal()) {
            for (LogDestination destination : logDestinations) {
                destination.write(formatter.format(level, message));
            }
        }
    }
}
