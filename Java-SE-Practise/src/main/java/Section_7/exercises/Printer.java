package Section_7.exercises;
/*
    Exercise 37 Section 7
 */
public class Printer {

    private int tonerLevel, pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if(tonerLevel > -1 && tonerLevel <= 100)
            this.tonerLevel = tonerLevel;
        else
            this.tonerLevel = -1;

        this.duplex = duplex;
        this.pagesPrinted = 0;
    }
    public int addToner(int tonerAmount){
        if(tonerAmount > 0 && tonerAmount <= 100){
            if(this.tonerLevel + tonerAmount > 100){
                return -1;
            }
            else{
                this.tonerLevel += tonerAmount;
                return this.tonerLevel;
            }
        }
        else
            return -1;
    }
    public int printPages(int pagesToPrint){
        if(duplex){
           if(pagesToPrint % 2 == 0){
               pagesToPrint /= 2;
           }
           else{
               pagesToPrint /= 2;
               pagesToPrint++;
           }
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        System.out.println(printer.addToner(50));
        System.out.println("Initial page count = " + printer.getPagesPrinted());
        int printedPages = printer.printPages(4);
        System.out.println("Total page printed count = " + printer.getPagesPrinted());
        printedPages = printer.printPages(2);
        System.out.println("Total page printed count = " + printer.getPagesPrinted());

    }
}

