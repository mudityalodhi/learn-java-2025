import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        // for (int i = 1; i <= 100000; i *= 10) {
        // System.out.println(i);
        // }

        // table of 7
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        // count digits of a given number
        int count = 0;
        int temp = num; // original number ko safe rakhne ke liye

        while (temp > 0) {
            temp = temp / 10; // last digit hata do
            count++;
        }
        System.out.println("Digits count = " + count);

        // sum of numbers till the input
        // int sum = 0;

        // for (int i = 0; i <= num; i++) {
        // sum += i;
        // }
        // System.out.println(sum);

        // for (int i = 1; i <= 10; i++) {
        // System.out.println(num + " x " + i + " = " + (i * num));
        // }
    }
}
