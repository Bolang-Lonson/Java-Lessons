class PrivateAM {
    /* Private access modifier is accessible only within class */
    private int data = 40;

    private void msg() {System.out.println("Hello Bolang!");}
}

class Simple {
    public static void main(String[] args) {
        PrivateAM obj = new PrivateAM();
        System.out.println(obj.data); // Compile time error
        obj.msg(); // Compile time error
    }
}