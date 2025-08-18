class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

}

public class RunnableDemo {
    public static void main(String[] args) {
        MyRunnable task = new MyRunnable();

        Thread t1 = new Thread(task, "Thread A");
        Thread t2 = new Thread(task, "Thread B");

        t1.start();
        System.out.println(Thread.currentThread().getState());
        t2.start();
        System.out.println(Thread.currentThread().getState());

    }
}
