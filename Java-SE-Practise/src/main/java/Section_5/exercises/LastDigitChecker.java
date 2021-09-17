package Section_5.exercises;
/*
    Exercise 19 Section 5
 */
public class LastDigitChecker {

    public static boolean hasSameLastDigit(int a, int b, int c){
        if((!LastDigitChecker.isValid(a)) || (!LastDigitChecker.isValid(b)) || (!LastDigitChecker.isValid(c))){
            return false;
        }
        if(a % 10 == b % 10){
            return true;
        }
        else if(a % 10 == c % 10){
            return true;
        }
        else if(c % 10 == b % 10){
            return true;
        }
        return false;
    }
    public static boolean isValid(int number){
        if(number < 10 || number > 1000){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(LastDigitChecker.hasSameLastDigit(43,12,71));
    }
}
