public class CheckEvenOrOdd {

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {

        boolean res = isEven(25);

        if (res) {
            System.out.println("Number is Even.");
        } else
            System.out.println("Number is Odd.");

    }
}
