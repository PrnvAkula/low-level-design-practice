package payment.pricing;

import entity.Ticket;

public class CostComputation {
    private PricingStrategy pricingStrategy;

    public CostComputation(PricingStrategy pricingStrategy){
        this.pricingStrategy = pricingStrategy;
    }

    public double getBill(Ticket ticket){
        return pricingStrategy.calculatePrice(ticket);
    }
}
