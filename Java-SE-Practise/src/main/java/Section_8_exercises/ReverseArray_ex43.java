package Section_8_exercises;

import java.util.Arrays;

public class ReverseArray_ex43 {
    public static void reverse(int [] array){
        System.out.println("Array given: " + Arrays.toString(array));
        int helper;
        for(int i=0; i < array.length/2; i++){
            helper = array[array.length - 1 - i];
            array[array.length -1 - i] = array[i];
            array[i] = helper;
        }
        System.out.println("Reversed array: " + Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] array = new int[]{13, 67, 22, 49, -7};
        ReverseArray_ex43.reverse(array);
    }
}
