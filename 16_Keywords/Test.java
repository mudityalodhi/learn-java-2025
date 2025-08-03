abstract class Vehicle {
    abstract void start();

    void fuelType() {
        System.out.println("Fuel type : Petrol");
    }
}

class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car is starting...");
    }
}

class Bike extends Vehicle {

    @Override
    void start() {
        System.out.println("Bike is starting..");
    }
}

public class Test {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        car.start();
        car.fuelType();

        bike.start();
        bike.fuelType();
    }
}
