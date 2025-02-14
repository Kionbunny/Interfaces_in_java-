//public class Child {
//}
class CreditCardPayment implements PaymentType{
    // the below method should always be public bcz by default interfaces are public and abstract
    // if we write any method without public then we will get compilation err attempting to reduce visibility
    //
//    public void show() {// implementation of Interface is done here by using {} braces
//        System.out.println("Child's implementation of show()");
//    }
//    public void display() {
//        System.out.println("Child's implementation of display() ");
//    }
//    public int x = 10;

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment " + amount);
    }
    // it has the new method specific to credit card
    public void CreditCardLimit(){
        System.out.println("checking credit card limit .. ");
    }
}
// what happens if we write the method without public
//If you try to implement an interface method with a lower access modifier (e.g., protected or default),
//the compiler will throw an error because it would be reducing the visibility of the inherited public method.