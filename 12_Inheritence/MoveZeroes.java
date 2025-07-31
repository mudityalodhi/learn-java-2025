public class MoveZeroes {

    public static void moveZeroesToEnd(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;

                count++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 0, 3 };
        moveZeroesToEnd(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
