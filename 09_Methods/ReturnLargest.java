public class ReturnLargest {

    public static int LargestOfArr(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int lar = LargestOfArr(new int[] {1, 20, 3});
        System.out.println("Largest element is: " + lar);
    }
}
