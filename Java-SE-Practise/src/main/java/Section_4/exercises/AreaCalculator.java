package Section_4.exercises;

import java.sql.SQLOutput;

/*
    Exercise 8 Section 4
 */
public class AreaCalculator {

    public static double area(double radius){
        double area = -1;
        if(radius >= 0){
            area = radius * radius * Math.PI;
        }
        return area;
    }
    public static double area(double x, double y){
        double area = -1;
        if(x >= 0 && y >= 0){
            area = x * y ;
        }
        return area;
    }

    public static void main(String[] args) {
        System.out.println(AreaCalculator.area( 4.0));
    }

}
