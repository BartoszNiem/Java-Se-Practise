package Section_5.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
    Exercise 27 Section 5
 */
public class InputCalculator {

    public static void inputPrintSumAndAverage(){
        Scanner in = new Scanner(System.in);
        System.out.println("Input integers if you have enough input something other than a integer");
        List<Integer> listOfInputs = new ArrayList<>();
        while(in.hasNextInt()){
            listOfInputs.add(in.nextInt());
        }
        int sum = 0;
        for (Integer i: listOfInputs) {
            sum += i;
        }
        long average = 0;
        if(listOfInputs.size() != 0) {
             average = Math.round(sum / (listOfInputs.size()));
        }

        System.out.println("SUM = " + sum + " AVG = " + average);
    }

    public static void main(String[] args) {
        InputCalculator.inputPrintSumAndAverage();
    }

}
