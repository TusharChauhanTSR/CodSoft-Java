import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New Balance: " + balance);
        } else {
            System.out.println("Invalid amount for deposit.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw successful. New Balance: " + balance);
        } else {
            System.out.println("Insufficient funds or invalid amount for withdrawal.");
        }
    }
}

class ATM {

    private BankAccount account;
    private Scanner sc;

    public ATM(BankAccount account) {
        this.account = account;
        this.sc = new Scanner(System.in);
    }

    public void showMenu() {
        System.out.println("Select Options");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    public void run() {
        int choice;
        do {
            showMenu();
            System.out.println("Enter your choice");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    System.out.println("Thanks for using the ATM !");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        } while (choice != 4);
    }

    private void checkBalance() {
        System.out.println("Your current balance is: " + account.getBalance());
    }

    private void deposit() {
        System.out.println("Enter the amount to deposit: ");
        double amount = sc.nextDouble();
        account.deposit(amount);
    }

    private void withdraw() {
        System.out.println("Enter the amount to withdraw: ");
        double amount = sc.nextDouble();
        account.withdraw(amount);
    }
}

public class New {
    public static void main(String[] args) {
        System.out.println("Welcome to the ATM!");
        Scanner sc = new Scanner(System.in);
        BankAccount userAccount = new BankAccount(30000);
        ATM atm = new ATM(userAccount);
        System.out.print("Enter your four digit PIN : ");
        int pin = sc.nextInt();
        if (pin == 1234) {
            atm.run();
        } else {
            System.out.println("Wrong pin");
        }
    }
}
