public class SwapWithoutThirdVar {
    public static void main(String[] args) {

        // Without Third Variable
        int a = 10;
        int b = 5;

        System.out.println("Before swapping : " + a + " and " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping : " + a + " and " + b);

    }
}
