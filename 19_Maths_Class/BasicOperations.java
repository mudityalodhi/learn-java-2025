import java.util.Scanner;

public class BasicOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        double num = sc.nextDouble();

        System.out.println("Square root of " + num + " = " + Math.sqrt(num));
        System.out.println("Absolute of " + num + " = " + Math.abs(num));
        // System.out.println( Math.max(24, 30));
        sc.close();
    }
}

// ? Basic Operations

// * User se ek number input lo, uska square root print karo.
// * User se ek number input lo, uska absolute value print karo.
// * Do numbers ka maximum aur minimum find karo.