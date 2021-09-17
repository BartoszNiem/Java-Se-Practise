package Section_5.exercises;
/*
    Exercise 15 Section 5
 */
public class NumberPalindrome {


    public static boolean isPalindrome(int number){
        String numberConverted = String.valueOf(Math.abs(number));

            for (int i = 0; i < numberConverted.length()/2; i++) {
                if(numberConverted.charAt(i) != (numberConverted.charAt(numberConverted.length() - i - 1))){
                    return false;
                }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(NumberPalindrome.isPalindrome(-1001));
    }

}
