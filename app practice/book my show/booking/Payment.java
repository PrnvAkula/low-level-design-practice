package booking;

import enums.PaymentStatus;

public class Payment {
    private int paymentId;
    private int amount;
    private String paymentMethod;
    private PaymentStatus paymentStatus;

    public int getPaymentId(){
        return paymentId;
    }

    public void setPaymentId(int paymentId){
        this.paymentId = paymentId;
    }

    public int getAmount(){
        return amount;
    }

    public void setAmount(int amount){
        this.amount = amount;
    }

    public String getPaymentMethod(){
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod){
        this.paymentMethod = paymentMethod;
    }

    public PaymentStatus getPaymentStatus(){
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus){
        this.paymentStatus = paymentStatus;
    }
}
