package Section_4.exercises;
/*
    Exercise 2 Section 4
 */
public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        }
        else {
            int megaBytes = (int) Math.floor(kiloBytes / 1024);
            int remainingKiloBytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
        }
    }

    public static void main(String[] args) {
        MegaBytesConverter.printMegaBytesAndKiloBytes(-5000);
    }
}
