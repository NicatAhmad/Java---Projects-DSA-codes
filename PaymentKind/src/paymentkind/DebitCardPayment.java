
package paymentkind;


class DebitCardPayment extends Payment {
    private String cardType;

    public DebitCardPayment(String cardType) {
        this.cardType = cardType;
    }

    public void verifyFunds() {
        System.out.println("Verifying Funds for Debit Card Payment of " + getAmount() + " " + getCurrency() + " (Card Type: " + cardType + ")");
        setStatus("Funds Verified");
    }

    @Override
    public void processPayment() {
        // Implement processPayment specific to DebitCardPayment
        verifyFunds();
    }
}
