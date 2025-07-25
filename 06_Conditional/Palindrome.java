// Q10. Check if a number is Palindrome
// 🔸 Input: 121
// 🔸 Output: Palindrome 

public class Palindrome {
    public static void main(String[] args) {
        int num = 121;
        int original = num;
        int rev = 0;

        // reverse a number
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }

        if (rev == original) {
            System.out.println("Palindrome.");
        } else {
            System.out.println("Not a Palindrome.");
        }
    }
}
