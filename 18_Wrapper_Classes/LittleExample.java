public class LittleExample {
    public static void main(String[] args) {

        // ? Take an int input and convert it to Integer object, then back to int

        int a = 10;
        Integer obj = a;

        System.out.println("Autoboxed : " + obj);

        Integer b = 20;
        int num = b;

        System.out.println("Unboxed : " + num);
    }
}
