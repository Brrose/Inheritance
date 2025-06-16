package util;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import view.RevenueDisplay;

/**
 * Logs the total revenue to a file using the Template Method pattern.
 */
public class TotalRevenueFileOutput extends RevenueDisplay {
    private static final String LOG_FILE_NAME = "totalRev.txt";
    private PrintWriter logFile;

    /**
     * Creates a new instance and opens the file for appending revenue logs.
     * @throws IOException If the file cannot be created or opened.
     */
    public TotalRevenueFileOutput() throws IOException {
        logFile = new PrintWriter(new FileWriter(LOG_FILE_NAME, true), true);
    }

    @Override
    protected void doShowTotalRevenue() throws Exception {
        logFile.println("Total revenue is: " + getTotalRevenue());
    }

    @Override
    protected void handleErrors(Exception e) {
        System.err.println("Could not write total revenue to file.");
        e.printStackTrace(); // Optional for debugging
    }

    @Override
    protected void doShowTotalIncome() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
