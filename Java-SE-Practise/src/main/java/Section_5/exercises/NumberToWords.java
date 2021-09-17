package Section_5.exercises;

import javax.security.auth.DestroyFailedException;

/*
    Exercise 23 Section 5
 */
public class NumberToWords {

    public static  void numberToWords(int number){
        if(number < 0){
            System.out.println("Invalid Value");
        }
        else{
        String numberAsWords = "";
        String convertedNumber = String.valueOf(number);
        for (int i = 0; i < convertedNumber.length(); i++) {
            switch (convertedNumber.charAt(i)) {
                case '0':
                    numberAsWords += " ZERO ";
                    break;
                case '1':
                    numberAsWords += " ONE ";
                    break;
                case '2':
                    numberAsWords += " TWO ";
                    break;
                case '3':
                    numberAsWords += " THREE ";
                    break;
                case '4':
                    numberAsWords += " FOUR ";
                    break;
                case '5':
                    numberAsWords += " FIVE ";
                    break;
                case '6':
                    numberAsWords += " SIX ";
                    break;
                case '7':
                    numberAsWords += " SEVEN ";
                    break;
                case '8':
                    numberAsWords += " EIGTH ";
                    break;
                case '9':
                    numberAsWords += " NINE ";
                    break;
            }
        }
            System.out.println("Number " + number + " as words: " + numberAsWords);
        }
    }


    public static void main(String[] args) {
        NumberToWords.numberToWords(1080);
    }
}
