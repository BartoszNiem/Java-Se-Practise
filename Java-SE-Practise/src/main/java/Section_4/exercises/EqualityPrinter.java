package Section_4.exercises;
/*
    Exercise 10 Section 4
 */
public class EqualityPrinter {

    public static void printEqual(int a, int b, int c){
        if(a<0 || b<0 || c<0){
            System.out.println("Invalid Value");
        }
        else{
            if(a==b){
                if(a==c){
                    System.out.println("All numbers are equal");
                }
                else{
                    System.out.println("Neither all are equal or different");
                }
            }
            else if(b==c){
                System.out.println("Neither all are equal or different");
            }
            else{
                if(a==c){
                    System.out.println("Neither all are equal or different");
                }
                else{
                    System.out.println("All numbers are different");
                }
            }
        }
    }
    public static void main(String[] args) {
        EqualityPrinter.printEqual(11,1,11);
    }


}
