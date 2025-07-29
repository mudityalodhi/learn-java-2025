import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean again = true;

        while (again) {
            System.out.println("=== Basic Calculator ===");
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            System.out.print("Choose operation (+, -, *, /): ");
            char op = sc.next().charAt(0);

            double result = 0;

            switch (op) {
                case '+':
                    result = Calculator.add(num1, num2);
                    break;
                case '-':
                    result = Calculator.subtract(num1, num2);
                    break;
                case '*':
                    result = Calculator.multiply(num1, num2);
                    break;
                case '/':
                    result = Calculator.division(num1, num2);
                    break;
                default:
                    System.out.println("Invalid operation.");
                    continue;
            }

            System.out.println("Result: " + result);

            System.out.print("Do you want to calculate again? (y/n): ");
            char choice = sc.next().charAt(0);
            if (choice != 'y' && choice != 'Y') {
                again = false;
            }
        }

        System.out.println("Calculator Closed. Thank you!");
        sc.close();
    }
}
