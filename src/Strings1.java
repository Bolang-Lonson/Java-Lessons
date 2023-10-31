public class Strings1 {
    public static void main(String[] args) {
        String s1 = "java";
        char ch[] = {'s','t','r','i','n','g','s'};
        String s2 = new String(ch);
        String s3 = new String("example");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }
}

/* Srting objects in java are immutable, meaning unmodifiable or unchangeable */
class TestImmutableString {
    public static void main(String[] args) {
        String s = "Bolang";
        s.concat("Lonson"); // concat method appends the string at the end
        System.out.println(s);
        // prints Bolang because strings are immutable
    }
}

class TestImmutableString1 {
    public static void main(String[] args) {
        String s = "Bolang";
        s = s.concat(" Lonson");
        System.out.println(s);
        // prints Bolang Lonson   
    }
}