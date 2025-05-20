package lab10.observer.texteditor;

import java.io.File;

public class LoggingListener implements EventListener {
    private File log;
    private String message;

    public LoggingListener(String logFilename, String message) {
        this.log = new File(logFilename);
        this.message = message;
    }

    @Override
    public void update(String filename) {
        System.out.println("Logger: " + String.format(message, filename));
    }
}
