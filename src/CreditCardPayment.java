public class CreditCardPayment extends Payment {
    private String cardNumber;

    public CreditCardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment() {
        System.out.println("Payment Type: CREDIT CARD");
        // Masks the card number for security (e.g., ************1234)
        String masked = "************" + cardNumber.substring(cardNumber.length() - 4);
        System.out.println("Processing $" + amount + " on card " + masked);
        System.out.println("Approved.");
    }
}
