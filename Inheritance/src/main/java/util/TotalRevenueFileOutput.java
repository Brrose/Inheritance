package util;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import view.RevenueDisplay;

/**
 * Logs total revenue to a file.
 */
public class TotalRevenueFileOutput extends RevenueDisplay {
    private static final String LOG_FILE_NAME = "totalRev.txt";
    private PrintWriter logFile;

    /**
     * Initializes file output stream for logging.
     * @throws IOException If the file cannot be opened.
     */
    public TotalRevenueFileOutput() throws IOException {
        logFile = new PrintWriter(new FileWriter(LOG_FILE_NAME, true), true);
    }

    @Override
    protected void doShowTotalRevenue(float totalRevenue) throws IOException {
        logFile.println("Total Revenue is: " + totalRevenue + " SEK");
    }

    @Override
    protected void handleErrors(Exception e) {
        System.err.println("Failed to log revenue to file: " + e.getMessage());
    }
}
