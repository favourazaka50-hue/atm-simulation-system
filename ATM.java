import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double balance = 1000;
        int choice;

        do {
            System.out.println("\n--- ATM MENU ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Choose option: ");
            choice = input.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("Balance: $" + balance);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    double deposit = input.nextDouble();
                    balance += deposit;
                    System.out.println("Deposit successful.");
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdraw = input.nextDouble();

                    if(withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Withdrawal successful.");
                    } else {
                        System.out.println("Insufficient balance.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM.");
                    break;

                default:
                    System.out.println("Invalid option.");
            }

        } while(choice != 4);
    }
}