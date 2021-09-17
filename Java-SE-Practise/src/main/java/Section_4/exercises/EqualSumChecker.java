package Section_4.exercises;
/*
    Exercise 6 Section 4
 */
public class EqualSumChecker {

    public static boolean hasEqualSum(int a, int b, int c){
        if(a + b == c)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        System.out.println(EqualSumChecker.hasEqualSum(1,1,1));
    }
}
