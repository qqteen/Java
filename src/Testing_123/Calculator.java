package Testing_123;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = userInput.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = userInput.nextDouble();

        System.out.print("Enter an operation (+, -, *, /): ");
        char operation = userInput.next().charAt(0);

        double result = 0;
        boolean validOperation = true;

        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2 ;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2 ;
                }
                else {
                    System.out.println("Error occur. Division by zero. ");
                    validOperation = false;
                }
                break;
            default:
                System.out.println("Error occur. Invalid operation. ");
        }
        if (validOperation) {
            System.out.println("Result = " + result);
        }
        userInput.close();
    }
}
