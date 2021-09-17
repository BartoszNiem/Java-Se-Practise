package Section_4.exercises;
/*
    Exercise 1 Section 4
 */
public class SpeedConverter {

    public static long toMilesPerHours(double kilometersPerHour){
        long convertedValue = -1;
        if(kilometersPerHour  >= 0){
            convertedValue = Math.round(kilometersPerHour / 1.609 );
        }
        return convertedValue;
    }
    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour < 0){
            System.out.println("Invalid Value");
        }
        else{
            System.out.println("" + kilometersPerHour + " km/h = " + Math.round(kilometersPerHour / 1.609) + " mi/h");
        }
    }
    public static void main(String[] args) {
        System.out.println(SpeedConverter.toMilesPerHours(75.114));
        SpeedConverter.printConversion(75.114);
    }
}
