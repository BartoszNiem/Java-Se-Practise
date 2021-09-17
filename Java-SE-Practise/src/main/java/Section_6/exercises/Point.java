package Section_6.exercises;
/*
    Exercise 32 Section 6
 */
public class Point{
    private  int x, y;
    public Point(){};
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double distance(){
        double distance = Math.sqrt((x*x) + (y*y));
        return distance;
    }
    public double distance(int x, int y){
        double distance = Math.sqrt(((this.x - x) * (this.x - x)) + ((this.y - y) * (this.y - y)));
        return distance;
    }
    public double distance(Point p2){
        double distance = Math.sqrt(((this.x - p2.x) * (this.x - p2.x)) + ((this.y - p2.y) * (this.y - p2.y)));
        return distance;
    }

    public static void main(String[] args) {
        Point p1 = new Point(6,5);
        Point p2 = new Point(3,1);
        System.out.println("Distance of p1 to (0,0) = " + p1.distance());
        System.out.println("Distance of p1 to p2 = " + p1.distance(p2));
        System.out.println("Distance of p1 to (2,2) = " + p1.distance(2,2));

    }
}
