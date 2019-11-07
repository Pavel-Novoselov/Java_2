package Lesson_6;

import java.io.IOException;
import java.util.Date;
import java.util.logging.*;

public class MainClass {
    private static final Logger logger  = Logger.getLogger("");
    public static void main(String[] args) throws IOException {
        logger.setLevel(Level.ALL);
        logger.getHandlers()[0].setLevel(Level.ALL);
        logger.getHandlers()[0].setFormatter(new Formatter() {
            @Override
            public String format(LogRecord record) {
                return record.getLevel() + "\t" + record.getMessage() + "\t" + record.getMillis() + "\n";
            }
        });

        logger.getHandlers()[0].setFilter(new Filter() {
            @Override
            public boolean isLoggable(LogRecord record) {
                return record.getMessage().startsWith("Ja");
            }
        });

        Handler handler = new FileHandler("mylog.log", true);
        handler.setLevel(Level.ALL);
        handler.setFormatter(new Formatter() {
            @Override
            public String format(LogRecord record) {
                return record.getLevel() + "\t" + record.getMessage() + "\t" +  new Date().getTime() + "\n";
            }
        });

        logger.addHandler(handler);

        logger.log(Level.SEVERE, "Java18");
        logger.log(Level.INFO, "Java2");
        logger.log(Level.CONFIG, "Java3");
        logger.log(Level.FINE, "C#");
        logger.log(Level.FINEST, "Java5");
    }
}
