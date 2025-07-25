// Q6. Print all numbers from 1 to N using while loop.
// 🔸 Input: N = 10
// 🔸 Output: 1 2 3 4 5 6 7 8 9 10

import java.util.Scanner;

public class OneToN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int i = 1;
        while (i <= num) {
            System.out.print(i + " ");
            i++;
        }
        sc.close();
    }
}
