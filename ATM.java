import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Account account = new Account();

        while (true) {

            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

            case 1:
                account.checkBalance();
                break;

            case 2:
                System.out.print("Enter Deposit Amount: ");
                double deposit = sc.nextDouble();
                account.deposit(deposit);
                break;

            case 3:
                System.out.print("Enter Withdraw Amount: ");
                double withdraw = sc.nextDouble();
                account.withdraw(withdraw);
                break;

            case 4:
                System.out.println("Thank You!");
                System.exit(0);

            default:
                System.out.println("Invalid Choice!");
            }
        }
    }
}
