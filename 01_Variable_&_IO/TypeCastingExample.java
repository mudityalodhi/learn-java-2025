public class TypeCastingExample {
    public static void main(String[] args) {
        int i = 1500;
        float f = i; // implicit casting

        float a = 20.21f;
        int b = (int) a; // explicit casting

        System.out.println("Int to Float: " + f);
        System.out.println("Float to Int: " + b);
    }
}
