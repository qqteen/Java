package Chapter2_ControlFlow;

public class Lesson1_IfStatement {
    public static void main(String[] args) {
     // if (condition) {}
        int a = 23;
        if (a<10) {
            System.out.println("This is less than 10");
        }
        else if (a>10 && a<20) {
            System.out.println("This is less than 20");
        }
        else if (a>20 && a<30) {
            System.out.println("This is less than 30");
        }
        else {
            System.out.println("This is nothing");
        }
        int b = 6;
        if (b>10) {
            System.out.println("This is bigger than 10");
        }
        else {
            System.out.println("This is less than 10");
        }
    }
}
