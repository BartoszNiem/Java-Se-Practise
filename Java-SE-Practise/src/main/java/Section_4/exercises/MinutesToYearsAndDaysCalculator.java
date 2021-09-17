package Section_4.exercises;
/*
    Exercise 9 Section 4
 */
public class MinutesToYearsAndDaysCalculator {

    public static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println("Invalid Value");
        }
        else{
            long years = minutes / (60*24*365);
            long days = (minutes - (years*(60*24*365))) / (60*24);
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
    public static void main(String[] args) {
        MinutesToYearsAndDaysCalculator.printYearsAndDays(561600);
    }
}
