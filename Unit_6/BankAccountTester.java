public class BankAccountTester {
    public static void main(String[] args) {
        double money = 1000;
        String name = "Atharva Mishra";

        BankAccount myAccount = new BankAccount(money, name);

        System.out.println("The " + myAccount.name + " account balance is, $" + myAccount.balance);

        myAccount.deposit(505.22);

        System.out.println("The " + myAccount.name + " account balance is, $" + myAccount.balance);

        myAccount.withdraw(100);

        System.out.println("The " + myAccount.name + " account balance is, $" + myAccount.balance);
    }    
}