import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        // Q3. Find the greatest of 3 numbers.

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();


        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " is greatest.");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is greatest.");
        } else {
            System.out.println(num3 + " is greatest.");
        }
        sc.close();
    }
}
