// Abstract Class
abstract class BankAccount {
    double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Abstract method — no body
    public abstract void deposit(double amount);

    // Abstract method — no body
    public abstract void withdraw(double amount);

    // Concrete method — has body
    public void showBalance() {
        System.out.println("Balance: " + balance);
    }
}
