
package paymentkind;


public abstract class Payment 
{
    private double amount ;
    private String currency ;
    private String status ;
    
    public Payment()
    {
        this.amount =0.0;
        this.currency = "USD";
        this.status = "Pending";
    }

    
    public double getAmount() {
        return amount;
    }

    
    public void setAmount(double amount) {
        this.amount = amount;
    }

   
    public String getCurrency() {
        return currency;
    }

    
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    
    public String getStatus() {
        return status;
    }

   
    public void setStatus(String status) {
        this.status = status;
    }
    public abstract void processPayment();
   
}
