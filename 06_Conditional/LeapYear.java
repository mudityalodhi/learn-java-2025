// Q4. Check if a year is leap year or not.
// 🔸 Input: year = 2024
// 🔸 Output: Leap year

// ✨ Memory Trick:
// "Divisible by 4 — probably a leap year
// Divisible by 100 — not a leap year
// Divisible by 400 — definitely a leap year"

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Year : ");
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");
        }
        sc.close();
    }
}
