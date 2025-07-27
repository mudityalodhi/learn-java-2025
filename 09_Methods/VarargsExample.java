public class VarargsExample {

    public static int add(int... n) {
        int sum = 0;
        for (int i : n) {
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(add(1, 2, 3));
        System.out.println(add(1, 3));
    }
}
