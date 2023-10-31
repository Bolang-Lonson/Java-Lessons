class Adder {
    // Changing number of parameters
    static int add(int a, int b) {return a+b;}
    static int add(int a, int b, int c) {return a+b+c;}
}

class TestOverloading {
    public static void main(String[] args) {
        System.out.println(Adder.add(11, 11));
        System.out.println(Adder.add(11, 11, 11));
    }
}

// We could also overload by changing data type of parameters