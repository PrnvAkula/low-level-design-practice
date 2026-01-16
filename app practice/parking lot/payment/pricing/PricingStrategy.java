package payment.pricing;

import entity.Ticket;

public interface PricingStrategy {
    public double calculatePrice(Ticket ticket);
}
