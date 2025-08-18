class NumberPrinter implements Runnable {
    private int start;

    public NumberPrinter(int start) {
        this.start = start;
    }

    @Override
    public void run() {
        for (int i = start; i <= 10; i += 2) {
            System.out.println(Thread.currentThread().getName() + " -> " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class OddEvenThreads {
    public static void main(String[] args) {
        Thread Odd = new Thread(new NumberPrinter(1), "OddThread");
        Thread Even = new Thread(new NumberPrinter(2), "EvenThread");

        Odd.start();
        Even.start();
    }
}
