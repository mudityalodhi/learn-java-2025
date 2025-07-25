public class StringTest {
    public static void main(String[] args) {
        String s1 = new String("muditya");
        String s2 = new String("muditya");

        System.out.println(s1 == s2);// false
        System.out.println(s1.equals(s2)); // true

        String s3 = "lodhi";
        String s4 = "lodhi";

        System.out.println(s3 == s4); // true
        System.out.println(s3.equals(s4)); // true
    }
}
