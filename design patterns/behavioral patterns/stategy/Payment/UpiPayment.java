package Payment;

public class UpiPayment implements PaymentStrategy{
    @Override
    public void processPayment(){
        System.out.println("Processing UPI payment...");
    }
}
