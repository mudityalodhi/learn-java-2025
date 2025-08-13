import java.util.Scanner;

public class StringTypeKuch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        try {
            int a = Integer.parseInt(str);  // String → int
            System.out.println("Number: " + a);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number");
        }

        sc.close();
    }
}
