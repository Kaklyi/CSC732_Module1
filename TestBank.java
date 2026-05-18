import java.util.Scanner;

public class TestBank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        CheckingAccount myAccount = new CheckingAccount();

        // creating account
        System.out.println("Welcome! Let's set up your account.");

        System.out.print("Enter your first name: ");
        myAccount.setFirstName(input.nextLine());

        System.out.print("Enter your last name: ");
        myAccount.setLastName(input.nextLine());

        System.out.print("Enter your account ID: ");
        myAccount.setAccountID(input.nextInt());

        System.out.print("Enter your interest rate: ");
        myAccount.setInterestRate(input.nextDouble());

        System.out.println("\nAccount created successfully!\n");

        // Menu loop
        int choice = 0;

        while (choice != 5) {
            System.out.println("What would you like to do?");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Apply Interest");
            System.out.println("4. Show Account Info");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = input.nextDouble();
                    myAccount.deposit(depositAmount);
                    System.out.println("Deposit successful!\n");
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = input.nextDouble();
                    myAccount.processWithdrawal(withdrawAmount);
                    System.out.println();
                    break;

                case 3:
                    myAccount.applyInterest();
                    System.out.println();
                    break;

                case 4:
                    System.out.println();
                    myAccount.displayAccount();
                    System.out.println();
                    break;

                case 5:
                    System.out.println("Thank you for using our bank system!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.\n");
            }
        }

        input.close();
    }
}
