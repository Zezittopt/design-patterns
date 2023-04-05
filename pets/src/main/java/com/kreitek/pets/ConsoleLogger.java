public class consoleLogger {
    private int logCounter;

    public ConsoleLogger() {
        this.logCounter = 0;
    }

    public void debug(String message) {
        logCounter++;
        System.out.println("[debug][" + logCounter + "] - " + message);
    }
}