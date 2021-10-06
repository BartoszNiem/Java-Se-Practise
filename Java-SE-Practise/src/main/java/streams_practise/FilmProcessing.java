package streams_practise;

import java.util.*;
import java.util.function.Predicate;

public class FilmProcessing {
    public static List<Film> filterByDurationGreaterThan(List<Film> films, int duration){
        return films.stream().filter(film -> film.getDuration() > duration).toList();
    }
    public static List<String> filmTitlesInUpperCase(List<Film> films){
        return films.stream().map(film -> film.getTitle().toUpperCase(Locale.ROOT)).toList();
    }
    public static List<Film> filterByGenreAndIMDBRatingLowerThan(List<Film> films,String genre, double imdbRating){
        return films.stream().filter(film -> film.getGenre().equals(genre) && film.getImdbRate() < imdbRating).toList();
    }
    public static Optional<Film> findFirstFilmOfGenre(List<Film> films, String genre){
        return films.stream().filter(film -> film.getGenre().equals(genre)).findFirst();
    }
    public static List<Film> returnTop3RatedMovies(List<Film> films){
        return films.stream().sorted(Comparator.comparingDouble(Film::getImdbRate).reversed()).limit(3).toList();
    }
    public static int getTotalDuration(List<Film> films){
        return films.stream().mapToInt(Film::getDuration).sum();
        //return films.stream().map(film -> film.getDuration()).reduce(0, Integer::sum);
    }
    public static Film getLongestFilm(List<Film> films){
        return films.stream().sorted(Comparator.comparingInt(Film::getDuration).reversed()).limit(1).toList().get(0);
    }
    public static boolean isThereAFilmSatisfayingCondition(List<Film> films, Predicate<Film> criterion){
        List<Film> satisfiedCondition = films.stream().filter(criterion).toList();
        if(!satisfiedCondition.isEmpty())
            return true;
        else
            return false;
    }
    public static List<Film> filmsWithSpecifiedSearchWord(List<Film> films, String searchWord){
        return films.stream().filter(film-> film.getSearchKeywords().contains(searchWord)).toList();
    }
    public static List<Film> filmsRealesedFromGivenInterval(List<Film> films, int fromYear, int toYear){
        return films.stream().filter(film -> film.getRealeaseYear() >= fromYear && film.getRealeaseYear() <= toYear).toList();
    }
    public static Optional<Film> findAnyFilmFromAGivenYear(List<Film> films, int year){
        return films.stream().filter(film -> film.getRealeaseYear() == year).findAny();
    }
    public static OptionalDouble getAverageRealeseYear(List<Film> films){
        return films.stream().mapToInt(Film :: getDuration).average();
    }




    public static void main(String[] args) {
        Film film1 = new Film("Inception", 148, 8.8, "action",
                List.of("dream", "ambiguous ending", "subconscious", "surprise ending", "mindbender"),
                2010);
        Film film2 = new Film("Fight club", 139, 8.8, "drama",
                List.of("surprising ending", "anti establishment", "insomnia", "multiple personality disorder", "based on a novel"),
                1999);
        Film film3 = new Film("Se7en", 127, 8.6, "crime",
                List.of("serial killer", "detective", "serial murderer", "seven deadly sins", "murder"),
                1995);
        Film film4 = new Film("Pulp fiction", 154, 8.9, "crime",
                List.of("nonlinear timeline", "overdose", "drug overdose", "drug use", "bondage"),
                1994);
        Film film5 = new Film("The Silence of the Lambs", 158, 8.6, "crime",
                List.of("serial killer", "psycho killer", "stuck in a well", "psychopath", "bad guy wins"),
                1991);
        Film film6 = new Film("The Shawshank Redemtion", 142, 9.3, "drama",
                List.of("wrongful imprisonment", "based on the works of stephen king", "prison", "escape from prison", "voice over narration"),
                1994);
        Film film7 = new Film("The Godfather", 175, 9.2, "crime",
                List.of("crime family", "mafia", "patriarch", "organized crime", "rise the power"),
                1972);
        Film film8 = new Film("Airplane!", 88, 7.7, "comedy",
                List.of("sppof", "airplane", "deadpan", "cockpit", "plane"),
                1980);
        Film film9 = new Film("The Naked Gun: From the Files of Police Squad!", 85, 7.6, "comedy",
                List.of("police detective", "spoof", "slapstick comedy", "parody", "assasin"),
                1988);
        Film film10 = new Film("The Nice Guys", 116, 7.4, "comedy",
                List.of("neo noir", "investigation", "los angeles california", "private investigation", "conspiracy"),
                2016);
        Film film11 = new Film("Knives Out", 130, 7.9, "comedy",
                List.of("private detective", "vomiting", "whodunit", "suspected suicide", "murder mystery"),
                2019);
        Film film12 = new Film("The Wolf of Wall Street", 180, 8.2, "biography",
                List.of("based on true story", "stockbroker", "fellatio", "sex in an airplane", "female nudity"),
                2013);
        Film film13 = new Film("Django Unchained", 165, 8.4, "drama",
                List.of("slavery", "racial violence", "racial vengeance", "historically inaccurate", "one against many"),
                2012);
        Film film14 = new Film("Inglorious Basterds", 153, 8.3, "adventure",
                List.of("revenge", "world war two", "nazi", "brutality", "nazi hunter"),
                2009);
        Film film15 = new Film("Watchmen", 162, 7.6, "action",
                List.of("rape", "conspiracy", "doomsday clock", "false promise of american dream", "nihilist"),
                2009);
        List<Film> watchList = new ArrayList<>(List.of(film1, film2, film3, film4, film5, film6, film7, film8, film9, film10, film11, film12, film13, film14, film15));

        //System.out.println("Films with duration longer than 160 minutes:\n" + FilmProcessing.filterByDurationGreaterThan(watchList,160));
        //System.out.println("Film titles in upper case:\n" + FilmProcessing.filmTitlesInUpperCase(watchList));
        //System.out.println("Films from particular genre and imdb rating lower than specified amount:\n"
        //      + FilmProcessing.filterByGenreAndIMDBRatingLowerThan(watchList, "crime", 9.0));
        /* Optional<Film> optionalFilm = FilmProcessing.findFirstFilmOfGenre(watchList, "conmedy");
        if(optionalFilm.isPresent())
            System.out.println("First film of specific genre:\n" + optionalFilm.get());
        else
            System.out.println("First film of specific genre doesn't exist");
         */
        //System.out.println("Top 3 rated movies on the watchlist:\n" + FilmProcessing.returnTop3RatedMovies(watchList));
        // System.out.println("Total watching duration of films in watchlist: " + FilmProcessing.getTotalDuration(watchList));
        //System.out.println("Longest movie: " + FilmProcessing.getLongestFilm(watchList));
       /* Predicate<Film> criterion = (film -> film.getSearchKeywords().contains("nihilist"));
        System.out.println("Are there films in watchlist satisfying the criterion: " + FilmProcessing.isThereAFilmSatisfayingCondition(watchList, criterion));
        */
        //System.out.println("List of films with search key word 'serial killer':\n" + FilmProcessing.filmsWithSpecifiedSearchWord(watchList, "serial killer"));
       // System.out.println("Films in watchlist from given time interval(1991 - 2000) :\n" + FilmProcessing.filmsRealesedFromGivenInterval(watchList, 1991, 2000));
         Optional<Film> optionalFilm = FilmProcessing.findAnyFilmFromAGivenYear(watchList, 1994);
        if(optionalFilm.isPresent())
            System.out.println("Any film of specific genre:\n" + optionalFilm.get());
        else
            System.out.println("No film of specific genre exist");

    }
}
