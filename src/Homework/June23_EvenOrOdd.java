package Homework;
import  java.util.Scanner;
public class June23_EvenOrOdd {
    public static void main(String[] args) {
       Scanner userInput = new Scanner(System.in);
       boolean calculate = true;

       while (calculate) {
           System.out.print("Please enter a value : ");
           int number = userInput.nextInt();

           if (number % 2 == 0){
               System.out.print("The answer is even.Thanks for using the program.  ");
               calculate = false;
           }
           else {
               System.out.println("The answer is odd. Try again. ");
           }

       }
       userInput.close();

    }
}
