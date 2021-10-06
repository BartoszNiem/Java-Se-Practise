package Section_8_exercises;

public class Song_ex46 {
    private String title;
    private double duration;

    public Song_ex46(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", title, duration);
    }
}
