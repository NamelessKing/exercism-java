public class LogLevels {
    
    public static String message(String logLine) {
        int indexOfColon = logLine.indexOf(':');
        return logLine.substring(++indexOfColon).trim().strip();
    }

    public static String logLevel(String logLine) {
        int indexOfColon = logLine.indexOf(':');
        String logLevel = logLine.substring(0,indexOfColon);
        return logLevel
                .replace('[',' ')
                .replace(']',' ')
                .trim()
                .strip()
                .toLowerCase();

    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}
