package lld.logger;

public class ConsoleLogDestination implements LogDestination {

    @Override
    public void write(String formattedMessage) {
        System.out.println(formattedMessage);
    }
}
