package Section_5.exercises;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
    Exercise 18 Section 8
 */
public class SharedDigit {

    public static boolean hasSharedDigit(int number1, int number2){
        if((number1 < 10 || number1 > 99) || (number2 < 10 || number2 > 99)){
            return false;
        }
        Set<Character> setOfCharacters = new HashSet<>();
        String convertedNumber1 = String.valueOf(number1), convertedNumber2 = String.valueOf(number2);

        for(int i=0; i< convertedNumber1.length(); i++){
            setOfCharacters.add(convertedNumber1.charAt(i));
        }

        for(int i=0; i< convertedNumber1.length(); i++){
            setOfCharacters.add(convertedNumber2.charAt(i));
        }
        if(setOfCharacters.size() == (convertedNumber1.length() + convertedNumber2.length())){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(SharedDigit.hasSharedDigit(32,51));
    }
}
