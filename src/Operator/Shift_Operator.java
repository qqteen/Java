package Operator;

public class Shift_Operator
{
    public static void main(String[] args)
    {
     int a = 10 << 4; // 10*2 ** 2
        System.out.println(a);

     int b = 10 >> 3; // 10 / 2 ** 3
        System.out.println(b);

     // 1010 << 3 = 1010000
     // 1010 >> 3 = 0001
    }
}
