public abstract class Payment {
    protected double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    // This is the polymorphic method
    public abstract void processPayment();
}
