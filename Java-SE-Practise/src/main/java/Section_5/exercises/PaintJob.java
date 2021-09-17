package Section_5.exercises;
/*
    Exercise 28 Section 5
 */
public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }
        double extraAmountOfPaint = areaPerBucket * extraBuckets;
        double areaToCover = width * height;
        areaToCover -= extraAmountOfPaint;
        int bucketsOfPaintNeeded = (int)Math.ceil((areaToCover / areaPerBucket));
        return bucketsOfPaintNeeded;
    }
    public static int getBucketCount(double width, double height, double areaPerBucket){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 ){
            return -1;
        }
        double areaToCover = width * height;
        int bucketsOfPaintNeeded = (int)Math.ceil((areaToCover / areaPerBucket));
        return bucketsOfPaintNeeded;
    }
    public static int getBucketCount(double area, double areaPerBucket){
        if(area <= 0  || areaPerBucket <= 0 ){
            return -1;
        }
        int bucketsOfPaintNeeded = (int)Math.ceil((area / areaPerBucket));
        return bucketsOfPaintNeeded;
    }
    public static void main(String[] args) {
        System.out.println(PaintJob.getBucketCount(3.24,0.75 ));
    }
}
