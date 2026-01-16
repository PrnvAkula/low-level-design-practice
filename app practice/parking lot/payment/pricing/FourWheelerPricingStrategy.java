package payment.pricing;

import java.time.Duration;
import java.time.LocalDateTime;

import entity.Ticket;

public class FourWheelerPricingStrategy implements PricingStrategy{
    @Override
    public double calculatePrice(Ticket ticket){
        LocalDateTime entryTime = ticket.getEntryTime();
        LocalDateTime currentTime = LocalDateTime.now();
        long hours = Duration.between(entryTime, currentTime).toHours();
        return 50.00 * hours;
    }
}
