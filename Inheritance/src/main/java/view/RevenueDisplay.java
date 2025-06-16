package view;

import dto.SaleDTO;
import model.SaleObserver;

/**
 * Abstract class using the Template Method Pattern
 * to handle revenue updates and display.
 */
public abstract class RevenueDisplay implements SaleObserver {
    private float totalRevenue = 0;

    @Override
    public void newSale(SaleDTO saleDTO) {
        totalRevenue += saleDTO.getTotalPrice();
        showTotalRevenue();
    }

    private void showTotalRevenue() {
        try {
            doShowTotalRevenue(totalRevenue);
        } catch (Exception e) {
            handleErrors(e);
        }
    }

    /**
     * Subclasses implement how to show total revenue.
     * @param totalRevenue The revenue to show.
     * @throws Exception If something goes wrong.
     */
    protected abstract void doShowTotalRevenue(float totalRevenue) throws Exception;

    /**
     * Subclasses implement how to handle display errors.
     * @param e The exception.
     */
    protected abstract void handleErrors(Exception e);
}
