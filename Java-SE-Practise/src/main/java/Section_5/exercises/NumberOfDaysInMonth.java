package Section_5.exercises;
/*
    Exercise 13 Section 5
 */
import Section_4.exercises.LeapYearCalculator;
public class NumberOfDaysInMonth {

    public static int getDaysInMonth(int month, int year){
        int numberOfDays = -1;
        if(year >= 1 && year <= 9999) {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    numberOfDays = 31;
                    break;
                case 2:
                    if (LeapYearCalculator.isLeapYear(year)) {
                        numberOfDays = 29;
                    } else {
                        numberOfDays = 28;
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    numberOfDays = 30;
                    break;
            }
        }
        return numberOfDays;
    }
    public static void main(String[] args) {
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(7, 2001));
    }
}
