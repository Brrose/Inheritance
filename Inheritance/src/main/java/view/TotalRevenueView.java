package view;

import view.RevenueDisplay;

/**
 * Displays total revenue on the console.
 */
public class TotalRevenueView extends RevenueDisplay {

    @Override
    protected void doShowTotalRevenue(float totalRevenue) {
        System.out.println("Total revenue is: " + totalRevenue + " SEK");
    }

    @Override
    protected void handleErrors(Exception e) {
        System.out.println("Error displaying revenue: " + e.getMessage());
    }
}
