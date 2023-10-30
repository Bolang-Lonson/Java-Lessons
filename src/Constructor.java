/** 1. Constructor name must be the same as class name
 *  2. Constructor must have no explicit return type
 * 
 * 2 types exist: Default constructor(no-arg constructor) and Parametrized constructor
 */

public class Constructor {
    
}

class Bike1 {
    /* Example of Default constructor */
    Bike1() {
        System.out.println("Bike is created");
    }

    public static void main(String[] args){
        Bike1 b = new Bike1();
    }
}

class Student4 {
    int id;
    String name;

    Student4(int i, String n){
        id = i;
        name = n;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args){
        Student4 s1 = new Student4(111, "Karan");
        Student4 s2 = new Student4(222, "Aryan");

        s1.display();
        s2.display();
    }
}