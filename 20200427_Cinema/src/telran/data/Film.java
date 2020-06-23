package telran.data;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

public class Film {
    private String title;
    private LocalDate date;
    private Genre genre;
    private Cinema[] cinemas;

    public Film(String title, LocalDate date, Genre genre, Cinema[] cinemas) {
        this.title = title;
        this.date = date;
        this.genre = genre;
        this.cinemas = cinemas;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Cinema[] getCinemas() {
        return cinemas;
    }

    public void setCinemas(Cinema[] cinemas) {
        this.cinemas = cinemas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Film)) return false;
        Film film = (Film) o;
        return getTitle().equals(film.getTitle()) &&
                getDate().equals(film.getDate()) &&
                getGenre() == film.getGenre() &&
                Arrays.equals(getCinemas(), film.getCinemas());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getTitle(), getDate(), getGenre());
        result = 31 * result + Arrays.hashCode(getCinemas());
        return result;
    }


    @Override
    public String toString() {
        return "Film: " + title +
                ", date: '" + date +
                ", genre:" + genre +
                ", cinemas:" + Arrays.toString(cinemas);
    }

    public void displayCinema(){
        for (Cinema c : cinemas) {
            System.out.println(c);
        }
    }
}
