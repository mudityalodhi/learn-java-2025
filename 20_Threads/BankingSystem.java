class BankAccount {
    private int balance = 1000;

    // Deposit money
    public synchronized void deposit(int amount, String user) {
        System.out.println(user + " is depositing: " + amount);
        balance += amount;
        System.out.println(user + " completed deposit. Current balance = " + balance);
    }

    // Withdraw money
    public synchronized void withdraw(int amount, String user) {
        System.out.println(user + " is trying to withdraw: " + amount);

        if (balance >= amount) {
            balance -= amount;
            System.out.println(user + " successfully withdrew " + amount + ". Current balance = " + balance);
        } else {
            System.out.println(user + " FAILED to withdraw " + amount + " (Insufficient balance: " + balance + ")");
        }
    }
}

class UserTransaction implements Runnable {
    private BankAccount account;
    private String user;
    private boolean isDeposit;
    private int amount;

    public UserTransaction(BankAccount account, String user, boolean isDeposit, int amount) {
        this.account = account;
        this.user = user;
        this.isDeposit = isDeposit;
        this.amount = amount;
    }

    @Override
    public void run() {
        if (isDeposit) {
            account.deposit(amount, user);
        } else {
            account.withdraw(amount, user);
        }
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Thread t1 = new Thread(new UserTransaction(account, "Muditya", false, 500));
        Thread t2 = new Thread(new UserTransaction(account, "Khushi", false, 800));
        Thread t3 = new Thread(new UserTransaction(account, "Aaaloo", true, 1000));

        t1.start();
        t2.start();
        t3.start();
    }
}
