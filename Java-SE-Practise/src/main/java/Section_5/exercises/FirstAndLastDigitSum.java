package Section_5.exercises;
/*
    Exercise 16 Section 5
 */
public class FirstAndLastDigitSum {

    public static int sumFirstAndLastDigit(int number){
        int sum = 0;
        if(number < 0){
            sum = -1;
        }
        else{
            String convertedNumber = String.valueOf(number);

            int numberOfDigits =  convertedNumber.length() -1;
            int n = 10;
            for (int i = 1; i < numberOfDigits; i++) {
                n *= 10;
            }
            sum = (number % 10) + (number / n);
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(FirstAndLastDigitSum.sumFirstAndLastDigit(109));
    }
}
