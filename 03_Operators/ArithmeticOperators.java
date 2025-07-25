// Demonstration of Arithmetic Operators in Java

public class ArithmeticOperators {
    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        // ➕ Addition
        int sum = a + b;
        System.out.println("Addition (a + b) = " + sum);

        // ➖ Subtraction
        int difference = a - b;
        System.out.println("Subtraction (a - b) = " + difference);

        // ✖️ Multiplication
        int product = a * b;
        System.out.println("Multiplication (a * b) = " + product);

        // ➗ Division
        int quotient = a / b;
        System.out.println("Division (a / b) = " + quotient);  // Integer division

        // % Modulus (Remainder)
        int remainder = a % b;
        System.out.println("Modulus (a % b) = " + remainder);

        // ✅ Example with float division
        float result = (float) a / b;
        System.out.println("Float Division (a / b) = " + result);
    }
}
