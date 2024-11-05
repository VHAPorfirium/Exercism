public class LogLevels {

    public static String message(String logLine) {
        int colonIndex = logLine.indexOf(":");
        String message = logLine.substring(colonIndex + 1).trim();
        return message;
    }

    public static String logLevel(String logLine) {
        int start = logLine.indexOf("[") + 1;
        int end = logLine.indexOf("]");
        return logLine.substring(start, end).toLowerCase();
    }

    public static String reformat(String logLine) {
        String level = logLevel(logLine);
        String message = message(logLine);
        return message + " (" + level + ")";
    }

    public static void main(String[] args) {
        System.out.println(LogLevels.message("[ERROR]: Invalid operation"));

        System.out.println(LogLevels.message("[WARNING]:  Disk almost full\r\n"));

        System.out.println(LogLevels.logLevel("[ERROR]: Invalid operation"));

        System.out.println(LogLevels.reformat("[INFO]: Operation completed"));
    }
}
