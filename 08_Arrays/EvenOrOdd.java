public class EvenOrOdd {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 8, 9, 15, 20, 22, 0, 2, 3, 12, 7 };
        int even = 0, odd = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                even++;
            else
                odd++;
        }
        System.out.println("Even : " + even);
        System.out.println("Odd : " + odd);
    }
}
