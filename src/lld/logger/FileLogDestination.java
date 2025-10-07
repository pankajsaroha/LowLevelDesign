package lld.logger;

import java.io.FileWriter;
import java.io.IOException;

public class FileLogDestination implements LogDestination {

    private final String filePath;

    public FileLogDestination (String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void write(String formattedMessage) {
        try (FileWriter writer = new FileWriter(filePath, true)) {
            writer.write(formattedMessage + System.lineSeparator());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
