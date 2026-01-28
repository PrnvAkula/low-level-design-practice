package Payment;

public class CashPayment implements PaymentStrategy{
    @Override
    public void processPayment(){
        System.out.println("Prociessing cash payment...");
    }
}
