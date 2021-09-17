package Section_7.exercises;
/*
    Exercise 39 Section 7
 */
public class Honda extends Car{

    public Honda(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine(){
        return "Honda -> The engine is starting";
    }
    @Override
    public String accelarate(){
        return "Honda -> Accelerating";
    }
    @Override
    public String brake(){
        return "Honda -> Braking";
    }
}
