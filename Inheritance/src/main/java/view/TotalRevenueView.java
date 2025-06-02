package view;

/**
 * The {@code TotalRevenueView} class is an implementation of {@link RevenueDisplay}.
 * Displays the total revenue by printing it to {@code System.out}.
 */
public class TotalRevenueView extends RevenueDisplay{
    
    /**
     * Prints the total revenue to the console.
     * @param totalRev The current total revenue to display.
     */
    @Override
    protected void printTotalRevenue (float totalRev) {
        System.out.println("Total revenue is: " + totalRev);
    }

    @Override
    protected void doShowTotalIncome() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected void handleErrors(Exception e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
