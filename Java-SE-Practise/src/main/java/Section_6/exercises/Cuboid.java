package Section_6.exercises;
/*
    Exercise 36 Section 6
 */
public class Cuboid extends Rectangle{
    private double height;
    public Cuboid(double width, double length, double height){
        super(width, length);
        if(height >= 0){
            this.height = height;
        }
        else
            this.height = 0;
    }

    public double getHeight() {
        return height;
    }
    public double getVolume(){
        return (this.getArea() * height);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width = " + rectangle.getWidth());
        System.out.println("rectangle.length = " + rectangle.getLength());
        System.out.println("rectangle.area = " + rectangle.getArea());
        Cuboid cuboid = new Cuboid(5, 10, 5);
        System.out.println("cuboid.width = " + cuboid.getWidth());
        System.out.println("cuboid.length = " + cuboid.getLength());
        System.out.println("cuboid.height = " + cuboid.getHeight());
        System.out.println("cuboid.area = " + cuboid.getArea());
        System.out.println("cuboid.volume = " + cuboid.getVolume());


    }
}
