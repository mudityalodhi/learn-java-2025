public class ReverseString {

    public static String reverse(String str) {
        // Base Case
        if (str.length() == 0 || str.length() == 1) {
            return str;
        }

        // Recursive case: substring(1) + first character
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String input = "mudit";
        String reversed = reverse(input);
        System.out.println("Reversed string: " + reversed); // Output: tidum
    }
}
