package Chapter2_ControlFlow;

public class Lesson4_DoWhileLoop {
    public static void main(String[] args) {
    //true
        int a = 1;
        do {
            System.out.print(a + " ");
            a++;
        }while (a<=20);
    //false
        int b = 2;
        do {
            System.out.println(b + " ");
            b++;
        }while (b>3);
    }
}
