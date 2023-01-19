import java.sql.Timestamp;
import java.util.Date;

public class Logger {
    private static Logger instance;
    protected int num = 1;
    void log(String msg) {
        System.out.println("[" + new Timestamp(System.currentTimeMillis()) + " " + num++ + "]" + msg);
    }

    private Logger() {

    }

    public static Logger getInstance() {
        if (instance == null) instance = new Logger();
        return instance;
    }
}