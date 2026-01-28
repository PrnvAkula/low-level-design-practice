import Payment.CardPayment;
import Payment.CashPayment;
import Payment.PaymentStrategy;
import Payment.UpiPayment;

public class Main {
    public static void main(String[] args){
        PaymentStrategy cardPayment = new CardPayment();
        PaymentStrategy cashPayment = new CashPayment();
        PaymentStrategy upiPayment = new UpiPayment();

        PaymentProcessor paymentProcessor = new PaymentProcessor(cardPayment);
        paymentProcessor.makePayment();

        paymentProcessor.setPaymentStrategy(cashPayment);
        paymentProcessor.makePayment();

        paymentProcessor.setPaymentStrategy(upiPayment);
        paymentProcessor.makePayment();
    }
}
