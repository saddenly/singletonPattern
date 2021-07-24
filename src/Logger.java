import java.util.Date;

public class Logger {
    private static final Logger logger = new Logger();
    private int num = 1;

    private Logger() {
    }

    public static Logger getInstance() {
        return logger;
    }

    public void log(String msg) {
        System.out.println("[" + new Date() + " " + num++ + "] " + msg);
    }
}