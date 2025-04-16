package lab7.comparable;

public class Movie implements Comparable<Movie> {
    private final String name;
    private final double rating;
    private final int year;

    public int compareTo(Movie movie) {
        return this.year - movie.getYear();
    }

    public Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public int getYear() {
        return year;
    }
}
