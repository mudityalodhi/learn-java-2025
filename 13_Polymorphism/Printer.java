class Printer {

    public void print(String text) {
        System.out.println("Text: " + text);
    }

    public void print(int number) {
        System.out.println("Number: " + number);
    }

    public void print(String text, int times) {
        for (int i = 1; i <= times; i++) {
            System.out.println(i + ". " + text);
        }
    }

    public static void main(String[] args) {
        Printer printer = new Printer();

        printer.print("Hello Polymorphism!");
        printer.print(2025);
        printer.print("Repeat me", 3);
    }
}