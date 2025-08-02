// Parent class
class Shape {
    public void area() {
        System.out.println("Area of shape");
    }
}

// Child class 1
class Circle extends Shape {
    @Override
    public void area() {
        System.out.println("Area of Circle = πr^2");
    }
}

// Child class 2
class Rectangle extends Shape {
    @Override
    public void area() {
        System.out.println("Area of Rectangle = length * width");
    }
}

// Main class to test
public class Main {
    public static void main(String[] args) {
        Shape s;

        s = new Circle(); // upcasting Circle to Shape
        s.area(); // calls Circle's area()

        s = new Rectangle(); // upcasting Rectangle to Shape
        s.area(); // calls Rectangle's area()
    }
}
