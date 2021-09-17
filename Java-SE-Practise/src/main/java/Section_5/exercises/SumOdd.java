package Section_5.exercises;
/*
    Exercise 14 Section 5
 */
public class SumOdd {

    public static boolean isOdd(int number){
        if(number > 0){
            if(number % 2 != 0){
                return true;
            }
            else
                return false;
        }
        else
            return false;
    }
    public static int summOdd(int start, int end){
        int sum = 0;
        if(start <= end && start >= 0 && end >= 0) {
            for (int i = start; i <= end; i++) {
                if (SumOdd.isOdd(i))
                    sum += i;
            }
        }
        else{
            sum = -1;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(SumOdd.summOdd(13, 13));
    }
}
