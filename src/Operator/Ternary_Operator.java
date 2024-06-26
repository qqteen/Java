package Operator;

public class Ternary_Operator
{
    public static void main(String[] args)
    {
//      (condition)? value : value;
        Object flag = (4>3)? true : "You are wrong";
        System.out.println(flag);

        int age = 21;
        String result = (age >= 18)? "U are adult" : "U are not adult";
        System.out.println(result);
    }
}
