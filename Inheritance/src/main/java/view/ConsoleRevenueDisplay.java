package view;

import view.RevenueDisplay; 


/**
 * Displays the total revenue in the console.
 */
public class ConsoleRevenueDisplay extends RevenueDisplay {

    protected void doShowTotalRevenue(float totalRevenue) {
        System.out.printf(">>> Total revenue so far: %.2f SEK%n", totalRevenue);
    }

    @Override
    protected void handleErrors(Exception e) {
        System.err.println("Error displaying revenue: " + e.getMessage());
    }

    @Override
    protected void doShowTotalRevenue() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected void doShowTotalIncome() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

