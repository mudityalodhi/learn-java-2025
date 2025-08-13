import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num2, num1, res;
        try {
            System.out.print("Enter first number: ");
            num1 = sc.nextInt();

            System.out.print("Enter second number: ");
            num2 = sc.nextInt();

            if (num2 == 0) {
                System.out.println("Cannot divide by Zero.");
            } else {
                res = num1 / num2;
                System.out.println("Result : " + res);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        sc.close();
    }
}
