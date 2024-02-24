import java.util.Scanner;
class BankAcc {
    private double balance;
    public BankAcc(double initialBalance) {
        this.balance = initialBalance;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }
}
class ATM {
    private BankAcc userAcc;
    public ATM(BankAcc acc) {
        this.userAcc = acc;
    }
    public void Menu() {
        System.out.println("\nFor Withdrawing money enter 1");
        System.out.println("For Depositing money enter 2");
        System.out.println("To Check account Balance enter 3");
        System.out.println("To Exit the interface enter 4\n");
    }
    public void performTransaction(int choice, Scanner scanner) {
        switch (choice) {
            case 1:
                System.out.print("\nEnter withdrawal amount: ");
                double withdrawAmount = scanner.nextDouble();
                if (userAcc.withdraw(withdrawAmount)) {
                    System.out.println("\nMoney Withdrawal is successful.");
                    System.out.println( "\nRemaining balance: " + userAcc.getBalance());
                } else {
                    System.out.println("\nWithdrawal failed. There is no enough money.");
                }
                break;
            case 2:
                System.out.print("\nEnter deposit amount: ");
                double depositAmount = scanner.nextDouble();
                userAcc.deposit(depositAmount);
                System.out.println("\nMoney Deposit is successful.");
                System.out.println("\nAccount balance after deposit: " + userAcc.getBalance());
                break;
            case 3:
                System.out.println("\nCurrent bank account balance: " + userAcc.getBalance());
                break;
            case 4:
                System.out.println("\nThank you!");
                System.exit(0);
                break;
            default:
                System.out.println("\nInvalid choice. Please select a valid option.");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAcc userAcc = new BankAcc(1000.0);
        ATM atm = new ATM(userAcc);
        while (true) {
            atm.Menu();
            System.out.print("Enter your choice from menu(1 to 4): ");
            int choice = sc.nextInt();
            atm.performTransaction(choice, sc);
        }
    }
}
