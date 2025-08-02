public class Main {
    public static void main(String[] args) {
        BankAccount myAcc = new SavingAccount(1000);  // upcasting
        myAcc.deposit(500);
        myAcc.withdraw(300);
        myAcc.showBalance();
    }
}
