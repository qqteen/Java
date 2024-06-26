package Homework;
import java.util.Scanner;
public class June16_SwitchStatement
{
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the package you want to buy : ");
        int Num = userInput.nextInt();

        switch (Num){
            case 1:
                System.out.println("You have purchased 350MB.");
                break;
            case 2:
                System.out.println("You have purchased 425MB.");
                break;
            case 3:
                System.out.println("You have purchased 480MB.");
                break;
            case 4:
                System.out.println("You have purchased 770MB.");
                break;
            default:
                System.out.println("Invalid value.");
        }
        userInput.close();
    }
}
