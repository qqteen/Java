package Testing_123;
import javax.sound.midi.Soundbank;
import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        double balance = 0.0;
        boolean running = true;
        System.out.println();
        System.out.println("***WELCOME TO SHIN(who doesn't love you) ATM***");

        while (running) {
            System.out.println("Option(1). Check Balance ");
            System.out.println("Option(2). Deposit Money to ATM ");
            System.out.println("Option(3). Withdraw Money from ATM ");
            System.out.println("Option(4). Exit from ATM ");
            System.out.println();
            System.out.print("Enter your choice: " );
            int choice = userInput.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your current balance: " + balance +"$");
                    break;
                case 2:
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = userInput.nextDouble();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.println("You have successfully deposited " + depositAmount + "$.");
                        System.out.println("Your new balance: " + balance + "$");
                    }
                    else {
                        System.out.println("Don't enter invalid amount Broke Ass Nigga.");
                    }
                    break;
                case 3:
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawAmount = userInput.nextDouble();
                    if(withdrawAmount > 0 && balance >= withdrawAmount) {
                        balance -= withdrawAmount;
                        System.out.println("You have successfully withdrawn " + withdrawAmount + "$.");
                        System.out.println("Your new balance: " + balance + "$");
                    }
                    else if (withdrawAmount > balance) {
                        System.out.println("Don't withdraw the amount you don't have Broke Ass Nigga.");
                    }
                    else {
                        System.out.println("Invalid withdraw amount.");
                    }
                    break;
                case 4:
                    running = false;
                    System.out.println("Thanks for using SHIN ATM. ");
                    System.out.println("Don't come back again SHIN doesn't love you. FUCK YOU");
                    break;
                default:
                    System.out.println("Enter a valid choice IDIOT.");

            }
            System.out.println();

        }
        userInput.close();
    }
}
