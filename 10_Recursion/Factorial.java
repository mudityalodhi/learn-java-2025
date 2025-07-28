public class Factorial {
    public static int factorial(int num) {
        int fact = 1;
        if (num == 0 || num == 1) {
            return 1;
        }
        fact = num * factorial(num - 1);
        return fact;
    }

    public static void main(String[] args) {
        int res = factorial(5);
        System.out.println(res);
    }
}
