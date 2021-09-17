package Section_5.exercises;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
    Exercise 25 Section 5
 */
public class LargestPrime {

    public static int getLargestPrime(int number){
        int largestPrimeFactor = -1;
        if(number <= 1){
            return largestPrimeFactor;
        }
        List<Integer> factors = new ArrayList<>();
        for (int i = 2; i <= number; i++) {
            if(number % i == 0){
                factors.add(i);
            }
        }

        return (int)factors.stream().filter(f -> LargestPrime.isPrime(f))
                .sorted(Comparator.reverseOrder()).toArray()[0];

    }
    public static boolean isPrime(int number){
        if(number <= 1){
            return false;
        }
        for (int i = 2; i < number/2; i++) {
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(LargestPrime.getLargestPrime(45));
    }
}
