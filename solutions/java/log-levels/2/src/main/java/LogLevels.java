import java.util.Locale;

public class LogLevels {

    private static final String LEVEL_CLOSE_AND_COLON = "]:";
    private static final char OPEN_BRACKET = '[';
    private static final char CLOSE_BRACKET = ']';

    public static String message(String logLine) {
        int sep = logLine.indexOf(LEVEL_CLOSE_AND_COLON);
        // Message starts immediately after "]:"
        return logLine.substring(sep + LEVEL_CLOSE_AND_COLON.length()).strip();
    }

    public static String logLevel(String logLine) {
        int start = logLine.indexOf(OPEN_BRACKET) + 1;
        int end = logLine.indexOf(CLOSE_BRACKET);
        return logLine.substring(start, end).toLowerCase(Locale.ROOT);
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}
