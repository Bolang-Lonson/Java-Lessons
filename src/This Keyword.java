/** 1. this can be used to refer to current class instance variable.
    2. this can be used to invoke current class method(implicitly)
    3. this() can be used to invoke current classconstructor.
    4. this can be passed as an argument in the method call.
    5. this can be passed as argument in the constructorcall.
    6. this can be used to return the current class instance from themethod.
 */

class Students {
    int rollno;
    String name;
    float fee;

    Students(int r, String n, float f) {
        this.rollno = r;
        this.name = n;
        this.fee = f;
    }

    void display() {System.out.println(rollno+" "+name+" "+fee);}
}


class TestThis2 {
    public static void main(String[] args) {
        Students s1 = new Students(111, "ankit", 5000f);
        Students s2 = new Students(112, "sumit", 6000f);

        s1.display();
        s2.display();
    }
}