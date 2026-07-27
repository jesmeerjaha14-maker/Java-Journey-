import java.util.Scanner;

public class ATMSystem {

    static double balance = 5000;

    public static void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }

    public static void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public static void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient Balance.");
        } else {
            balance -= amount;
            System.out.println("Please collect your cash.");
            System.out.println("Remaining Balance: ₹" + balance);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n========== ATM MENU ==========");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    checkBalance();
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ₹");
                    deposit(sc.nextDouble());
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ₹");
                    withdraw(sc.nextDouble());
                    break;

                case 4:
                    System.out.println("Thank you for using our ATM.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}