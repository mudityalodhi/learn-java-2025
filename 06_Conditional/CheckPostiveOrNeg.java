// Q1. Check if a number is positive, negative, or zero.

import java.util.Scanner;

public class CheckPostiveOrNeg {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check : ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println(num + " is Positive.");
        } else if (num < 0) {
            System.out.println(num + " is Negative.");
        } else {
            System.out.println(num + " is Zero.");
        }
        sc.close();
    }
}