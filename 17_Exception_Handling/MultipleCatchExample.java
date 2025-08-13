import java.util.Scanner;

public class MultipleCatchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 30};

        try {
            System.out.print("Enter numerator: ");
            int num = sc.nextInt();

            System.out.print("Enter denominator: ");
            int den = sc.nextInt();

            System.out.print("Enter array index to access: ");
            int index = sc.nextInt();

            int result = num / den; // May throw ArithmeticException
            System.out.println("Result: " + result);

            System.out.println("Array element: " + arr[index]); // May throw ArrayIndexOutOfBoundsException

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index");
        } catch (Exception e) {
            System.out.println("Some other error occurred");
        }
        sc.close();
    }
}
