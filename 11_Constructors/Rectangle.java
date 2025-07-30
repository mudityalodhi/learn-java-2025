public class Rectangle {
    double length;
    double width;

    // Constructor to initialize values
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate area using object fields
    public double area() {
        return length * width;
    }

    // Method to calculate perimeter using object fields
    public double perimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 5);

        System.out.println("Area: " + rectangle.area());
        System.out.println("Perimeter: " + rectangle.perimeter());
    }
}
