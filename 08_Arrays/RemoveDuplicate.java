public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {4, 5, 4, 2, 5, 6, 1, 3};

        System.out.print("Unique values: ");
        
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
