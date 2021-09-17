package Section_4.exercises;
/*
    Exercise 4 Section 4
 */
public class LeapYearCalculator {

    public static boolean isLeapYear(int year){
        boolean answer = false;
        if(year >= 1 && year <= 9999){
            if(year % 4 == 0){
                if(year % 100 == 0){
                    if(year % 400 == 0){
                        answer = true;
                    }
                }
                else{
                    answer = true;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(LeapYearCalculator.isLeapYear(1604));
    }
}
