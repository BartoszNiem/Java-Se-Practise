package Section_4.exercises;
/*
    Exercise 7 Section 4
 */
public class TeenNumberChecker {

    public static boolean hasTeen(int a, int b, int c){
        if(a>=13 && a<=19)
            return true;
        if(b>=13 && b<=19)
            return true;
        if(c>=13 && c<=19)
            return true;

        return false;
    }
    public static void main(String[] args) {
        System.out.println(TeenNumberChecker.hasTeen(162,142,11));
    }

}
