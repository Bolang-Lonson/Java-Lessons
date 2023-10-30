public class Variable_Types {
    
}

class A {
    int data = 50; // instance variable. Defined inside class but outside any method
    static int m = 100; //static vriable. Cannot be local
    final int age = 22; // a constant ie its value cannot be changed after declaration

    void method() {
        int n = 90; //local variable
    }
}