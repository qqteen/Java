package Homework;
import java.util.Scanner;
public class June16_WhileLoop{

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int count = 0;
        int result = 0;
        System.out.println("Please enter a value.");

        while (count<5) {
            System.out.print("You enter " + (count + 1) + " out of 5 : " );
            int num = userInput.nextInt();
            result += num;
            count++;
        }
        System.out.println("Total Result is " + result + "." );
        userInput.close();
    }

}
