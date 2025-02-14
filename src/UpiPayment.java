public class UpiPayment implements PaymentType {
    public void processPayment (double amount) {
     System.out.println("Processing Payment via UPI " + amount);
    }
    // New method specific to UpiPayment
    public void validateUpiId(String upiId) {
        if (upiId.matches("^[a-zA-Z0-9]+@[a-zA-Z0-9]+$")) {
            System.out.println("✅ UPI ID is valid.");
        } else {
            System.out.println("❌ Invalid UPI ID format.");
        }
    }
}
// here the two classes implements the single Interface which is payment
// that acts as the interface (common functionality) b/w different payment methods
// but our end goal is to process the payment which ever method it is done