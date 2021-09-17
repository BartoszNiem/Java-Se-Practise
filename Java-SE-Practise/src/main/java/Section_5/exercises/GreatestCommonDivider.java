package Section_5.exercises;
/*
    Exercise 20 Section 5
 */
public class GreatestCommonDivider {

    public static int getGreatestCommonDivisor(int first, int second){
        int solution = -1;
        if(first >= 10 && second >= 10){
            solution = 1;
            for (int i = 1; i < first && i< second; i++) {
                if( first % i == 0 && second % i == 0){
                    solution = i;
                }
            }
        }
        return solution;
    }
    public static void main(String[] args) {
        System.out.println(GreatestCommonDivider.getGreatestCommonDivisor(12, 30));
    }
}
