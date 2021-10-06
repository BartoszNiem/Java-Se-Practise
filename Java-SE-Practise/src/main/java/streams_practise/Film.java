package streams_practise;

import java.util.List;

public class Film {
    private String title;
    private int duration;
    private double imdbRate;
    private String genre;
    private List<String> searchKeywords;
    private int realeaseYear;

    public Film(String title, int duration, double imdbRate, String genre, List<String> searchKeywords, int realeaseYear) {
        this.title = title;
        this.duration = duration;
        this.imdbRate = imdbRate;
        this.genre = genre;
        this.searchKeywords = searchKeywords;
        this.realeaseYear = realeaseYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getImdbRate() {
        return imdbRate;
    }

    public void setImdbRate(double imdbRate) {
        this.imdbRate = imdbRate;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public List<String> getSearchKeywords() {
        return searchKeywords;
    }

    public void setSearchKeywords(List<String> searchKeywords) {
        this.searchKeywords = searchKeywords;
    }

    public int getRealeaseYear() {
        return realeaseYear;
    }

    public void setRealeaseYear(int realeaseYear) {
        this.realeaseYear = realeaseYear;
    }

    @Override
    public String toString() {
        return "Film{" +
                "title='" + title + '\'' +
                '}';
    }
}
