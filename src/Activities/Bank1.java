package banking;

import java.util.Scanner;

public class Bank1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("HELLO WELCOME TO THE SYSTEM!");
        System.out.println("What do you feel doing today? ");
        System.out.println("1. Banking");
        System.out.println("2. Doctors Appointment");
        System.out.println("3. Shopping");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                bankingClass bc = new bankingClass();

                System.out.println("Enter your Account No: ");
                int accountNo = sc.nextInt();

                boolean success = false;

                for (int attempts = 1; attempts <= 3; attempts++) {
                    System.out.println("Enter your Pin: ");
                    int pin = sc.nextInt();

                    if (bc.verifyAccount(accountNo, pin)) {
                        System.out.println("LOGIN SUCCESS");
                        bc.viewBalance();   
                        success = true;
                        break;
                    } else {
                        if (attempts < 3) {
                            System.out.println("INVALID PIN! Try again. (" + (3 - attempts) + " attempts left)");
                        } else {
                            System.out.println("INVALID PIN! You have exceeded the maximum number of attempts.");
                        }
                    }
                }

                if (!success) {
                    System.out.println("ACCESS DENIED. Returning to main menu.");
                }
                break;

            case 2:
                System.out.println("Doctor's Appointment feature coming soon!");
                break;

            case 3:
                System.out.println("Shopping feature coming soon!");
                break;

            default:
                System.out.println("Invalid Selection!");
        }
    }
}
