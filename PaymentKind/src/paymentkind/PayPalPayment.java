
package paymentkind;


class PayPalPayment extends Payment {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    public void executePayment() {
        System.out.println("Executing PayPal Payment of " + getAmount() + " " + getCurrency() + " (Email: " + email + ")");
        setStatus("Executed");
    }

    @Override
    public void processPayment() {
        // Implement processPayment specific to PayPalPayment
        executePayment();
    }
}
