package OOPS.Basics.Encapsulation;

public class oops8 {
    static class BankAccount {
        private double balance;

        BankAccount(String accountHolder, double balance) {
            this.balance = balance;
        }

        void deposit(double amount) {
            if (amount <= 0) {
                return;
            }

            balance += amount;
        }

        void withdraw(double amount) {
            if (amount <= 0 || amount > balance) {
                return;
            }

            balance -= amount;
        }

        void displayBalance() {
            System.out.println("Balance: " + balance);
        }

    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Dipan", 10000);

        b1.deposit(5000);
        b1.withdraw(3000);
        b1.displayBalance();
    }
}
