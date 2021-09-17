package Section_7.exercises;

public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name, healthyExtra2Name;
    private double healthyExtra1Price, healthyExtra2Price;
    public HealthyBurger(String meat, double price){
        this.name = "Healthy";
        this.meat = meat;
        this.price = price;
        this.breadRollType = "Brown rye";
    }
    public void addHealthyExtra1(String healthyExtra1Name, double healthyExtra1Price){
        this.healthyExtra1Name = healthyExtra1Name;
        this.healthyExtra1Price = healthyExtra1Price;
    }
    public void addHealthyExtra2(String healthyExtra2Name, double healthyExtra2Price){
        this.healthyExtra2Name = healthyExtra2Name;
        this.healthyExtra2Price = healthyExtra2Price;
    }
    @Override
    public double itemizehamburger(){
        double normalPrice = super.itemizehamburger();
        if(healthyExtra1Name != null){
            System.out.println(String.format("Added %s for an extra %.2f", healthyExtra1Name, healthyExtra1Price));
            this.price += healthyExtra1Price;
        }
        if(healthyExtra2Name != null){
            System.out.println(String.format("Added %s for an extra %.2f", healthyExtra2Name, healthyExtra2Price));
            this.price += healthyExtra2Price;
        }
        return this.price;
    }
}
