package Section_5.exercises;
/*
    Exercise 22 Section 5
 */
public class PerfectNumber {


    public static boolean isPerfectNumber(int number){
        if(number <1){
            return false;
        }
        int sumOfNumbersFactors = 0;
        for (int i = 1; i < number; i++) {
            if(number % i == 0){
                sumOfNumbersFactors += i;
            }
        }
        if(sumOfNumbersFactors == number)
            return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(PerfectNumber.isPerfectNumber(24));
    }
}
