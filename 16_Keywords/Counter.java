class Counter {
    static int count = 0; // shared by all objects

    public Counter() {
        count++; // increase count when object is created
    }

    public static void displayCount() {
        System.out.println("Objects created: " + count);
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        
        Counter.displayCount(); // call using class name
    }
}
