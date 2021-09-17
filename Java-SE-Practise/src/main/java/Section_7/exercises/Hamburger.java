package Section_7.exercises;

public class Hamburger {
    protected String name, meat, breadRollType;
    protected double price;

    protected String addition1Name, addition2Name, addition3Name, addition4Name;
    protected double addition1Price, addition2Price, addition3Price, addition4Price;

    public Hamburger() {
    }

    public Hamburger(String name, String meat, String breadRollType, double price) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
    }
    public void addHamburgerAddition1(String addition1Name, double addition1Price){
        this.addition1Name = addition1Name;
        this.addition1Price = addition1Price;
    }
    public void addHamburgerAddition2(String addition2Name, double addition2Price){
        this.addition2Name = addition2Name;
        this.addition2Price = addition2Price;
    }
    public void addHamburgerAddition3(String addition3Name, double addition3Price){
        this.addition3Name = addition3Name;
        this.addition3Price = addition3Price;
    }
    public void addHamburgerAddition4(String addition4Name, double addition4Price){
        this.addition4Name = addition4Name;
        this.addition4Price = addition4Price;
    }

    public double itemizehamburger(){
        System.out.println(String.format("%s Hamburger on a %s Roll with %s, price is %.2f", name, breadRollType, meat, price));
        if(addition1Name != null){
            System.out.println(String.format("Added %s for an extra %.2f", addition1Name, addition1Price));
            this.price += addition1Price;
        }
        if(addition2Name != null){
            System.out.println(String.format("Added %s for an extra %.2f", addition2Name, addition2Price));
            this.price += addition2Price;
        }
        if(addition3Name != null){
            System.out.println(String.format("Added %s for an extra %.2f", addition3Name, addition3Price));
            this.price += addition3Price;
        }
        if(addition4Name != null){
            System.out.println(String.format("Added %s for an extra %.2f", addition4Name, addition4Price));
            this.price += addition4Price;
        }
        return this.price;
    }

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage","White", 4.67);
        hamburger.addHamburgerAddition1("Egg", 3.45);
        hamburger.addHamburgerAddition2("Tomato", 2.05);
        hamburger.addHamburgerAddition3("Lettuce", 0.78);
        System.out.println(String.format("Total price of the burger = %.2f",hamburger.itemizehamburger()));


        HealthyBurger healthyBurger = new HealthyBurger("Chicken", 7.77);
        healthyBurger.addHamburgerAddition1("Egg", 3.45);
        healthyBurger.addHealthyExtra1("Lentils", 1.50);
        System.out.println(String.format("Total price of the burger = %.2f",healthyBurger.itemizehamburger()));

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addHamburgerAddition1("Cheese", 0.80);
        System.out.println(String.format("Total price of the burger = %.2f",deluxeBurger.itemizehamburger()));

    }

}
