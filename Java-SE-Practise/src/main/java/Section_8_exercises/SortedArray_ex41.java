package Section_8_exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SortedArray_ex41 {
    public static Integer[] getIntegers(int arraySize){
        Integer[] array = new Integer[arraySize];
        Scanner in = new Scanner(System.in);
        for(int i=0; i < arraySize; i++){
            array[i] = in.nextInt();
        }
        return array;
    }
    public static void printArray(Integer[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(String.format("Element %d contents %d", i, array[i]));
        }


    }
    public static Integer[] sortIntegers(Integer[] arrayUnsorted){
        Integer[] sortedArray = Arrays.copyOf(arrayUnsorted, arrayUnsorted.length);
        Arrays.sort(sortedArray, Collections.reverseOrder());
        return sortedArray;
    }

    public static void main(String[] args) {

        SortedArray_ex41.printArray(SortedArray_ex41.sortIntegers(SortedArray_ex41.getIntegers(5)));
    }
}
