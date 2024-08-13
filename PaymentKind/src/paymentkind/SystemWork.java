
package paymentkind;

public class SystemWork {

   
       public static void main(String[] args) {

        CreditCardPayment creditCardPayment = new CreditCardPayment("Visa");
        DebitCardPayment debitCardPayment = new DebitCardPayment("Mastercard");
        PayPalPayment payPalPayment = new PayPalPayment("example@example.com");

        creditCardPayment.setAmount(100.0);
        debitCardPayment.setAmount(50.0);
        payPalPayment.setAmount(200.0);

        Payment[] payments = { creditCardPayment, debitCardPayment, payPalPayment };

        for (Payment payment : payments) {
            // Use polymorphism to process payments
            payment.processPayment();
            System.out.println("Payment Status: " + payment.getStatus());
        }
    }
    
}
