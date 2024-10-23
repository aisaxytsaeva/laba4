import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Logging {
    private final static Logger log = Logger.getLogger(Logging.class.getName());
    private final static Path logFilePath = Paths.get("logfile.txt");

    public static void logger(Throwable ex) {
        PrintWriter writer = null;
        try {
            if (!Files.exists(logFilePath)) {
                Files.createDirectories(logFilePath.getParent());
            }
            writer = new PrintWriter(logFilePath.toFile(), "UTF-8");
            writer.println(ex.toString());
            writer.flush();
        } catch (IOException e) {
            log.log(Level.SEVERE, "Error writing to log file.", e);
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }
}
