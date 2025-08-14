import java.util.Scanner;

public class StringToInteger {

    // * */ Convert String to Integer
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String s = sc.nextLine();

        Integer num = Integer.parseInt(s);
        System.out.println("Integer : " + num);
        sc.close();
    }
}

// Input: "123"
// Output: 123 as int
// Hint: Use Integer.parseInt()
