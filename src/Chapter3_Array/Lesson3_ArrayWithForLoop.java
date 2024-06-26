package Chapter3_Array;

import java.util.Arrays;

public class Lesson3_ArrayWithForLoop {
    public static void main(String[] args) {
        int numbers[] = {10,20,30,40,50,60,70,80,90};

//for each
//        for (int num : numbers) {       //for(datatype eachValue : arrayName
//            System.out.print(num + " ");
//        }
//        System.out.println();
//
//        System.out.println(Arrays.toString(numbers)); // String value = "[10,20,30,40,50,60,70,80,90]"
//
//        System.out.println();

//for each calculation
//        for(int n : numbers) {
//            System.out.print(n+2 + " ");
//        }
//            System.out.println();

            int sum = 0;
         for(int Num : numbers) {
            sum += Num;
         }
            System.out.println("Total value is " + sum);
    }
}
