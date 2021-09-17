package Section_6.exercises;
/*
    Exercise 31 Section 6
 */
public class Wall{
    private double width, height;
    public Wall(){

    }
    public Wall(double width, double height){
        if(height < 0)
            this.height = 0;
        else
            this.height = height;
        if(width < 0)
            this.width = 0;
        else
            this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        if(height >=0)
            this.height = height;
        else
            this.height = 0;
    }

    public void setWidth(double width) {
        if(width >= 0)
            this.width = width;
        else
            this.width = 0;
    }
    public double getArea(){
        return height * width;
    }

    public static void main(String[] args) {
        Wall wall = new Wall(5,4);
        System.out.println("Area = " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("Width = " + wall.getWidth());
        System.out.println("Height = " + wall.getHeight());
        System.out.println("Area = " + wall.getArea());
    }
}
