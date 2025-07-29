class Calculator {

    // addition
    public static double add(double a, double b) {
        return a + b;
    }

    // subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // division
    public static double division(double a, double b) {
        if (b == 0) {
            System.out.println("Can't divide by Zero.");
            return 0;
        }
        return a / b;
    }

}