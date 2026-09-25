package OOPS.Basics;

public class oops2 {
    static class BankAccount {
        String accountHolder;
        long accountNumber;
        double balance;

        void deposit(double amount) {
            balance += amount;
        }

        void withdraw(double amount) {
            balance -= amount;
        }

        void displayBalance() {
            System.out.println("Balance: " + balance);
        }
    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();

        b1.accountHolder = "Dipan";
        b1.accountNumber = 123456789;
        b1.balance = 10000;

        b1.deposit(5000);
        b1.withdraw(3000);
        b1.displayBalance();
    }
}
