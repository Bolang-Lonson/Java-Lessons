/** Static methods belong to the class rather than the object 
 * Can be invoked without the need for creating an instance of a class
 * Can access static data member and change its value
*/

class StaticMethod {
    int rollno;
    String name;
    static String college = "ITS";

    static void change() { // Static Method
        college = "ENSTP";
    }

    StaticMethod(int r, String n) { // Constructor
        rollno = r;
        name = n;
    }

    void display() {System.out.println(rollno+" "+name+" "+college);}

    public static void main(String[] args) {
        StaticMethod.change();
        StaticMethod s1 = new StaticMethod(111, "Karan");
        StaticMethod s2 = new StaticMethod(222, "Aryan");
        StaticMethod s3 = new StaticMethod(333, "Sonoo");

        s1.display();
        s2.display();
        s3.display();
    }
}
