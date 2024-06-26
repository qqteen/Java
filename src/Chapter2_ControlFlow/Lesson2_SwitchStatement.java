package Chapter2_ControlFlow;

public class Lesson2_SwitchStatement
{
    public static void main(String[] args) {
    // switch (expression){}
    // case : value;
    // break;
        int myVal = 20;
        switch(myVal){
            case 10:
                System.out.println("I am 10 years old.");
                break;
            case 20:
                System.out.println("I am 20 years old.");
                break;
            case 30:
                System.out.println("I am 30 years old.");
                break;
            default:
                System.out.println("Invalid Value.");
                break;
        }
    }
}
