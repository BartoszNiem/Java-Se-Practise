package Section_4.exercises;
/*
    Exercise 11 Section 4
 */
public class PlayingCat {

    public static boolean isCatPlayin(boolean summer, int temperature){
        boolean answer = false;
       if(summer){
           if(temperature >= 25 && temperature <= 45)
               answer = true;
       }
       else{
           if(temperature >= 25 && temperature <= 35)
               answer = true;
       }
       return answer;
    }
    public static void main(String[] args) {
        System.out.println(PlayingCat.isCatPlayin(false, 25));
    }
}
