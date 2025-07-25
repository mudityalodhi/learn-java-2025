import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;

        for (int i = num; i > 0; i = i / 10) {
            count++;
        }

        // Handle special case: if number is 0
        if (num == 0) {
            count = 1;
        }

        System.out.println("Total digits: " + count);
        sc.close();
    }
}
