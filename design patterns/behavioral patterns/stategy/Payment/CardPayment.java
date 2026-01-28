package Payment;

public class CardPayment implements PaymentStrategy{
    @Override
    public void processPayment(){
        System.out.println("processing card payment...");
    }
}
