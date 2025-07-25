public class GreatestInArr {
    
    // Find Greatest Element in Array
    public static void main(String[] args) {
        int[] arr = { 4, 1, 2, 3, 10, 5 };
        int max = arr[0];

        for (int i = 1; i > arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Greatest : " + max);
    }
}
