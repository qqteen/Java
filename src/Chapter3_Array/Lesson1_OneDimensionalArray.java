package Chapter3_Array;

import java.util.Arrays;

public class Lesson1_OneDimensionalArray {
    public static void main(String[] args) {
        //datatype arrayName[] = {values};
        String names[] = {"Ag Ag", "Mg Mg", "Kg Kg", "Htet Htet"};
        int numbers[] = {123,423,43,24,53,55,33,35};

        System.out.println(names[3]); //arrayName[index_No] = Value;

        System.out.println(Arrays.toString(numbers)); // all arrays

        System.out.println(numbers.length); // index number



    }
}
