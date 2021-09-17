package Section_7.exercises;

public class DeluxeBurger extends Hamburger{
    public DeluxeBurger() {
        this.name = "Deluxe";
        this.breadRollType = "White";
        this.meat = "Sausage & Bacon";
        this.price = 14.54;
        super.addHamburgerAddition1("Chips", 2.75);
        super.addHamburgerAddition2("Drink", 1.81);
    }
    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1Price){
        System.out.println("You cannot add additions to a deluxe burger!!!");
    }
    @Override
    public void addHamburgerAddition2(String addition2Name, double addition2Price){
        System.out.println("You cannot add additions to a deluxe burger!!!");
    }
    @Override
    public void addHamburgerAddition3(String addition3Name, double addition3Price){
        System.out.println("You cannot add additions to a deluxe burger!!!");
    }
    @Override
    public void addHamburgerAddition4(String addition4Name, double addition4Price){
        System.out.println("You cannot add additions to a deluxe burger!!!");
    }

}
