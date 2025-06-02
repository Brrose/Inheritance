package model;

/**
 * The {@code SaleObserver} abstract class defines a template method 
 * for observers of sales to implement. It uses the Template Method pattern.
 */
public abstract class SaleObserver {
    private float totalIncome = 0;

    /**
     * Template method called when a sale has been completed.
     * @param totalPrice The price of the sale that was just made.
     */
    public void newSale(float totalPrice) {
        increaseTotalPrice(totalPrice);
        totalRev();
    }

    private void totalRev() {
        try {
            doShowTotalIncome();
        } catch (Exception e) {
            handleErrors(e);
        }
    }

    /**
     * Increases total income by adding the price of the latest sale.
     * 
     * @param price The price of the most recent sale
     */
    protected void increaseTotalPrice(float price) {
        totalIncome += price;
    }

    /**
     * Abstract method to show the total income.
     * Subclasses must implement this.
     * 
     * @throws Exception if showing fails
     */
    protected abstract void doShowTotalIncome() throws Exception;

    /**
     * Abstract method to handle errors.
     * Subclasses must implement this.
     * 
     * @param e the Exception to handle
     */
    protected abstract void handleErrors(Exception e);

    /**
     * Getter for the total income value.
     * 
     * @return total income accumulated so far
     */
    protected float getTotalIncome() {
        return totalIncome;
    }
}

