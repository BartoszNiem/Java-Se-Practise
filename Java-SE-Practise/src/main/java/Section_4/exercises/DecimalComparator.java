package Section_4.exercises;
/*
    Exercise 5 Section 4
 */
public class DecimalComparator {
    public static boolean areEqualByTreeDecimalPlaces(double d1, double d2){
        String s1 = String.valueOf(d1);
        String s2 = String.valueOf(d2);

        String s1_integer = s1.split("\\.")[0];
        String s1_fractional = s1.split("\\.")[1];
        String s2_integer = s2.split("\\.")[0], s2_fractional = s2.split("\\.")[1];

        if(!s1_integer.equals(s2_integer)){
            return false;
        }

        int number = Math.min(s1_fractional.length(), s2_fractional.length());
        int finalNumber = Math.min(number, 3);
        for (int i = 0; i < finalNumber; i++) {
            if(s1_fractional.charAt(i) != s2_fractional.charAt(i)){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(DecimalComparator.areEqualByTreeDecimalPlaces(3.1754, 3.8));
    }
}
