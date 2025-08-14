public class WrapperExample {
    public static void main(String[] args) {
        // Autoboxing: primitive → object
        int a = 5;
        Integer obj = a; // automatically converted

        // Unboxing: object → primitive
        Integer num = 10;
        int b = num; // automatically converted

        System.out.println("Autoboxed: " + obj);
        System.out.println("Unboxed: " + b);
    }
}
