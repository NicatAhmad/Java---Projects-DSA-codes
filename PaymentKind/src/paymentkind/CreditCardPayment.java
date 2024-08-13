
package paymentkind;


public class CreditCardPayment extends Payment
{
    private String cardType ;
    public CreditCardPayment (String cardType  )
    {
        this.cardType = cardType;
        
    }
    public void authorizePayment()
    {
         System.out.println("Authorizing Credit Card Payment of " + getAmount() + " " + getCurrency() + " (Card Type: " + cardType + ")");
        setStatus("Authorized");
    }
      @Override
    public void processPayment() {
        
        authorizePayment();
    }
}

