public interface PaymentType {
    // the below method declarations are by default public and abstract in java
    int x = 9; // fields in Java are public , static and final
    // ✔ public (accessible from anywhere)
    //✔ static (belongs to the interface, not instance)
    //✔ final (constant, cannot be changed after initialization) or cannot be modified in the class clas

    // interfaces have only the method declarations and not implementations
    // child class will implement the interfaces by implements

    void processPayment(double amount);

}
