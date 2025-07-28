public class SumOfNaturalNumbers {

    public static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        int res = sum(10);
        System.out.println("Sum : " + res);
    }
}
