package view;

import dto.SaleDTO;
import model.SaleObserver;

public abstract class RevenueDisplay implements SaleObserver {
    private float totalRevenue = 0;

    public void newSale(SaleDTO saleDTO) {
        totalRevenue += saleDTO.getTotalPrice();
        showTotalRevenue();
    }

    private void showTotalRevenue() {
        try {
            doShowTotalRevenue();
        } catch (Exception e) {
            handleErrors(e);
        }
    }

    protected float getTotalRevenue() {
        return totalRevenue;
    }

    protected abstract void doShowTotalRevenue() throws Exception;
    protected abstract void handleErrors(Exception e);
}
