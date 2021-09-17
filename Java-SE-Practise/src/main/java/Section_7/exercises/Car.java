package Section_7.exercises;
/*
    Exercise 39 Section 7
 */
public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name){
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }
    public String startEngine(){
        return "Car -> The engine is starting";
    }
    public String accelarate(){
        return "Car -> Accelerating";
    }
    public String brake(){
        return "Car -> Braking";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Car baseCar = new Car(4, "Base car");
        Car mitsubishi = new Mitsubishi(6, "Lancer");
        Car honda = new Honda(2, "Jazz");
        Car ford = new Ford(4, "Focus");
        System.out.println(baseCar.startEngine());
        System.out.println(baseCar.brake());
        System.out.println(baseCar.accelarate());

        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.brake());
        System.out.println(mitsubishi.accelarate());

        System.out.println(honda.startEngine());
        System.out.println(honda.brake());
        System.out.println(honda.accelarate());

        System.out.println(ford.startEngine());
        System.out.println(ford.brake());
        System.out.println(ford.accelarate());
    }

}
