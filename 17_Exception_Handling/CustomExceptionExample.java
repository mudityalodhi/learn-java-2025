// // Custom Exception class
// class AgeInvalidException extends Exception {
//     public AgeInvalidException(String message) {
//         super(message);
//     }
// }

import java.util.Scanner;

public class CustomExceptionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter age: ");
            int age = sc.nextInt();

            if (age < 18) {
                throw new AgeInvalidException("Age is less than 18, not allowed");
            }
            System.out.println("Age accepted, proceed further");

        } catch (AgeInvalidException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}

class AgeInvalidException extends Exception {
    public AgeInvalidException(String message) {
        super(message);
    }
}