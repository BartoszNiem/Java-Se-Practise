package Section_6.exercises;

/*
    Exercise 33 Section 6
 */
public class Carpet {
    private double cost;
    public Carpet(double cost){
        if(cost >= 0)
            this.cost = cost;
        else
            this.cost = 0;
    }

    public double getCost() {
        return cost;
    }
}
