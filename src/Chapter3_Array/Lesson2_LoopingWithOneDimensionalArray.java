package Chapter3_Array;

import java.util.Arrays;

public class Lesson2_LoopingWithOneDimensionalArray {
    public static void main(String[] args) {
        String names[] = {"Ag Ag", "Mg Mg", "Kg Kg", "Htet Htet"};
        int numbers[] = {123,423,43,24,53,55,33,35};

        for (int i = 0; i < names.length; i++){
            System.out.print(names[i].toUpperCase()+", ");
        }
        for (int i = 1; i<numbers.length; i++){
            System.out.print(numbers[i] + " ");
       }
        for (int i = names.length - 1; i >= 0 ; i--) {
            System.out.print(names[i]+ ", ");
        }



    }
}
