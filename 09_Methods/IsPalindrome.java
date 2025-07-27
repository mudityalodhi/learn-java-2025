public class IsPalindrome {

    public static boolean palindrome(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return str.equals(rev);
    }

    public static void main(String[] args) {
        boolean result = palindrome("ana");
        System.out.println(result);
    }
}
