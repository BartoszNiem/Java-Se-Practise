package Section_7.exercises;
/*
    Exercise 39 Section 7
 */
public class Mitsubishi extends Car{

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }
    @Override
    public String startEngine(){
        return "Mitsubishi -> The engine is starting";
    }
    @Override
    public String accelarate(){
        return "Mitsubishi -> Accelerating";
    }
    @Override
    public String brake(){
        return "Mitsubishi -> Braking";
    }
}
