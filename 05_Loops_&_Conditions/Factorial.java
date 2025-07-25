public class Factorial {
    public static void main(String[] args) {
        int num = 5;
        int fac = 1;

        for (int i = num; i > 0; i--) {
            fac *= i;
        }

        System.out.println("Factorial of " + num + " is: " + fac);
    }
}
