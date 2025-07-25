// Q9. Reverse a number.
// 🔸 Input: num = 123
// 🔸 Output: 321

public class ReverseAnumber {
    public static void main(String[] args) {
        int num = 1234;
        int rev = 0;

        // % 10 → nikal lo last digit
        // / 10 → hata do last digit
        // rev = rev * 10 + digit → ulta jod lo

        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }

        System.out.println("Reversed: " + rev);

    }
}
