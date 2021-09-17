package Section_4.exercises;
/*
    Exercise 3 Section 4
 */
public class BarkingDog {

    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay){
        boolean answer = false;
        if(isBarking && hourOfDay>=0 && hourOfDay <= 23){
            if(hourOfDay < 8 || hourOfDay > 22){
                answer = true;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(BarkingDog.shouldWakeUp(false, 23));
    }
}
