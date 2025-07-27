public class EvenNumbers {

    public static void printEvenNumbers(int n) {
        System.out.println("Even numbers from 1 to " + n + ":");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int N = 20;
        printEvenNumbers(N);
    }
}
