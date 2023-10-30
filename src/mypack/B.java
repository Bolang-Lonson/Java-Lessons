package mypack;
import pack.*;

public class B {
    public static void main(String[] args) {
        C obj = new C(); // Compile time error
        obj.msg(); // Compile time error
    }
}

class D extends A {
    public static void main(String[] args) {
        D obj = new D();
        obj.msg();
    }
}