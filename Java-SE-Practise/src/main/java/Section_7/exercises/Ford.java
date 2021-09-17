package Section_7.exercises;
/*
    Exercise 39 Section 7
 */
public class Ford extends Car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }
    @Override
    public String startEngine(){
        return "Ford -> The engine is starting";
    }
    @Override
    public String accelarate(){
        return "Ford -> Accelerating";
    }
    @Override
    public String brake(){
        return "Ford -> Braking";
    }
}
