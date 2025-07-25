public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = { 15, 10, 5, 20, 25, 30 };

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i : arr) {
            if (i > max) {
                secondMax = max;
                max = i;
            } else if (i > secondMax && i != max) {
                secondMax = i;
            }
        }

        System.out.println("Second Max: " + secondMax);
    }
}
