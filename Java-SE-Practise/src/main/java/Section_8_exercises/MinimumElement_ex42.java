package Section_8_exercises;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement_ex42 {
    public static int readInteger(){
        Scanner in = new Scanner(System.in);
        int numberOfElements = in.nextInt();
        return numberOfElements;
    }
    public static int[] readElements(int numberOfElements){
        int [] array = new int[numberOfElements];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < numberOfElements; i++) {
            array[i] = in.nextInt();
        }
        return array;
    }
    public static int getMin(int[] array){
        Arrays.sort(array);
        return array[0];
    }

    public static void main(String[] args) {
        System.out.println(MinimumElement_ex42.getMin(MinimumElement_ex42.readElements(MinimumElement_ex42.readInteger())));
    }
}
