public class UpiPayment implements PaymentType {
    public void processPayment (double amount) {
     System.out.println("Processing Payment via UPI " + amount);
    }
}
// here the two classes implements the single Interface which is payment
// that acts as the interface (common functionality) b/w different payment methods
// but our end goal is to process the payment which ever method it is done