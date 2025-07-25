// Q7. Count the digits of a number.
// 🔸 Input: num = 5432
// 🔸 Output: Digits = 4

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        int count = 0;

        while (num > 0) {
            num = num / 10;
            count++;
        }
        System.out.println(count);
        sc.close();
    }
}
