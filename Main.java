//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // create an object of child class
        CreditCardPayment obj1 = new CreditCardPayment();
        obj1.processPayment(15000);

        UpiPayment obj2 = new UpiPayment();
        obj2.processPayment(2500.150);
        // use the above the calling methods via object
        // if you know which payment method you use beforehand (already know which payment type we use)
        // if not then use all of them dynamically by creating a reference to the interface
        // and assigning it to a different object each time based on the previous payment status
        //Using interface reference for dynamic payment selection concept of Polymorphism
        // the method behaves based on the context how it is being called
        // same method processPayment outputs differently for ex : of i want to make Credit card payment
        // then output will be like this  System.out.println("Processing credit card payment " + amount);
        // and for UPI is also similar with the code written in the UPI class
//        PaymentType pay ;
//        pay = new CreditCardPayment();
//        pay.processPayment(1000);
//
//        pay = new UpiPayment();
//        pay.processPayment(1500.99);
    }
}