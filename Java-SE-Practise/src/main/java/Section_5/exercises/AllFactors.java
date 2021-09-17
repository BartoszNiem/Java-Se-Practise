package Section_5.exercises;
/*
    Exercise 21 Section 5
 */
public class AllFactors {

    public static void printFactors(int number){
        if(number < 1){
            System.out.println("Invalid Value");
        }
        else{
            System.out.println("Factors of a number " + number + " :");
            for (int i = 1; i <= number; i++) {
                if(number % i == 0){
                    System.out.println(i);
                }
            }
        }

    }
    public static void main(String[] args) {
        AllFactors.printFactors(-32);
    }
}
