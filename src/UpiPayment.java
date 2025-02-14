import java.util.Objects;

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
    public void checkUPIApp(String str){
        if("PhonePey".equals(str)){// check if the string str which is passed as argument is matched
            // with "PhonePey" or not
            System.out.println("Only PhonePey is accepted as UPI payment app");
        }else {
            System.out.println("Other UPI payment apps are not allowed ");
        }
    }
}
// here the two classes implements the single Interface which is payment
// that acts as the interface (common functionality) b/w different payment methods
// but our end goal is to process the payment which ever method it is done