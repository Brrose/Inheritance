package view;

import dto.SaleDTO;
import model.SaleObserver;

/**
 * The {@code RevenueDisplay} class is an observer of sales that keeps track of the total revenue.
 * It updates the total revenue when a sale is completed.
 */
public abstract class RevenueDisplay extends SaleObserver {
    
    /**
     * Updates the total revenue and calls the method {@code printTotalRevenue} to display it.
     * Is called when a sale is completed.
     * @param totalPrice The total price of the completed sale.
     */
    @Override
    public void newSale(float totalPrice) {
        increaseTotalPrice(totalPrice);
        printTotalRevenue(getTotalIncome());
    }
    
    /**
     * Displays the total revenue.
     * @param totalRev The current total revenue after the latest completed sale.
     */
    protected abstract void printTotalRevenue(float totalRev);
}
