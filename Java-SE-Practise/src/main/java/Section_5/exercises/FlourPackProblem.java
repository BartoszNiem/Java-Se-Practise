package Section_5.exercises;
/*
    Exercise 24 Section 5
 */
public class FlourPackProblem {

    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }
        while(goal >= 5 && bigCount > 0){
            bigCount--;
            goal -= 5;
        }
        if(smallCount >= goal){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("" + FlourPackProblem.canPack(2, 2, 11));
    }


}

