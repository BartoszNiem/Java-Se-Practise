package Section_5.exercises;
/*
    Exercise 17 Section 5
 */
public class EvenDigitSum {

    public static int   getEvenDigitSum(int number){
        int sum = 0;
        if(number < 0){
            sum = -1;
        }
        else{
            String convertedValue = String.valueOf(number);
            for (int i = 0; i < convertedValue.length(); i++) {
                if(Character.getNumericValue(convertedValue.charAt(i)) % 2 == 0){
                    sum += Character.getNumericValue(convertedValue.charAt(i));
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(EvenDigitSum.getEvenDigitSum(123456789));
    }
}
