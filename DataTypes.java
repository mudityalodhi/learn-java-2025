public class DataTypes {
    public static void main(String[] args) {

        // 🔹 1. Integer types

        byte byteValue = 100; // 1 byte (-128 to 127)
        short shortValue = 32000; // 2 bytes (-32,768 to 32,767)
        int intValue = 100000; // 4 bytes (most commonly used integer type)
        long longValue = 9223372036854775807L; // 8 bytes (L is mandatory for long literals)

        System.out.println("byte: " + byteValue);
        System.out.println("short: " + shortValue);
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);

        // 🔹 2. Floating-point types

        float floatValue = 3.14f; // 4 bytes (f is required)
        double doubleValue = 3.14159265359;// 8 bytes (default for decimal numbers)

        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);

        // 🔹 3. Character type

        char charValue = 'A'; // 2 bytes (stores a single character using Unicode)
        System.out.println("char: " + charValue);

        // 🔹 4. Boolean type

        boolean isJavaFun = true; // 1 bit (only true or false)
        boolean isRainy = false;

        System.out.println("is Java fun? " + isJavaFun);
        System.out.println("is it rainy? " + isRainy);

        // 🔹 5. String (not a primitive, but very commonly used)

        String name = "Muditya"; // String is a class, not a primitive type
        System.out.println("Name: " + name);
    }
}
