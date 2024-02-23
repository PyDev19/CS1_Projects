public class BankAccount {
    public double balance;
    public String name;

    BankAccount(double _balance, String _name) {
        balance = _balance;
        name = _name;
    }

    public void deposit(double deposit) {
        balance += deposit;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
}
