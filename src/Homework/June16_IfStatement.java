package Homework;
import java.util.Scanner;

public class June16_IfStatement
{
    public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
        System.out.print("Enter your Age : ");
        int age = userInput.nextInt();

        if (age<1){
            System.out.println("Enter a valid Age. ");
            return;
        }
        if(age>=1 && age<=17){
            System.out.println("You are still young.");
        }
        else if(age>=18 && age <=40){
            System.out.println("You are adult.");
        }
        else {
            System.out.println("You are now old.");

        }

        userInput.close();

    }
}
