package telran.dao;

import telran.data.Cinema;
import telran.data.Film;
import telran.data.Genre;

import java.time.LocalDate;
import java.util.Scanner;

import static java.lang.String.*;

public class Schedule {
    private Film[] films;
    private int size;

    public Schedule(int capacity) {
        films = new Film[capacity];
        size = 0;
    }

    public boolean addFilm(Film film) {
        if (size < films.length) {
            films[size] = film;
            size++;
            return true;
        }
        return false;
    }

    public boolean removeFilm(Film film) {
        for (int i = 0; i < size; i++) {
            if (films[i].equals(film)) {
                films[i] = films[size - 1];
                size--;
                return true;
            }
        }
        return false;
    }

    public void displayFilms() {
        for (int i = 0; i < size; i++) {
            System.out.println(films[i]);
        }
    }

    public void displayFilmsByDate(LocalDate date) {
        System.out.println(date + " you can watch the following films");
        for (int i = 0; i < size; i++) {
            if (films[i].getDate().equals(date)) {
                System.out.println(films[i].getTitle() + ", " + films[i].getGenre());
                films[i].displayCinema();
                System.out.println("----------------------------------");
            }
        }
    }

    public void displayFilmsByCinema(String cinema) {
        System.out.println("In cinema " + " you can watch: ");
        boolean flag = false;
        for (int i = 0; i < size; i++) {
            if (Cinema.isCinemaInArray(films[i].getCinemas(), cinema)) {
                System.out.println(films[i].getTitle() + ", " + films[i].getGenre() + "\n" + films[i].getDate());
                System.out.println("--------------------------");
            }
        }
        System.out.println((flag) ? "" : "not information about cinema " + cinema);
    }

    public int getIndexOfFilm(String title) {
        int indexOfFilm = -1;
        for (int i = 0; i < size; i++) {
            if (films[i].getTitle().equalsIgnoreCase(title)) {
                indexOfFilm = i;
            }
        }
        return indexOfFilm;
    }

    public void displayCinemasByFilmTitle(String title) {
        int index = getIndexOfFilm(title);
        if (index < 0) {
            System.out.println("The movie is not in schedule");
        } else {
            System.out.println("You can watch " + title + " " + films[index].getDate() + " in the following cinemas");
            films[index].displayCinema();
        }
    }


    // home work

    public int getIndexOfFilmByGenre(Genre genre) {
        int indexOfFilm = 0;
        for (int i = 0; i < size; i++) {
            if (films[i].getGenre().equals(genre)) {
                indexOfFilm++;
            }
        }
        return indexOfFilm;
    }

    public void displayCinemaByFilmGenre(Genre genre) {
        int index = getIndexOfFilmByGenre(genre);
        if (index < 0) {
            System.out.println("There is no movie with such genre in schedule.");
        } else {
            System.out.println("You can watch " + genre + " movie" + " in the following cinemas:");
            films[index].displayCinema();
        }
    }

    public void displayFilmsByGenre(Genre genre) {
        System.out.println("You can watch the following movies with the genre " + genre);
        for (int i = 0; i < size; i++) {
            if (films[i].getGenre().equals(genre)) {
                System.out.println(films[i].getTitle() + "\n" + films[i].getDate());
                films[i].displayCinema();
            }
        }
    }

    public void findFilmByTitle(String string) {
        for (int i = 0; i < size; i++) {
            if (films[i].getTitle().equalsIgnoreCase(string)) {
                System.out.println("You can watch the following movie on " + films[i].getDate() + " in the following cinemas:");
                films[i].displayCinema();
                return;
            }
        }
        System.out.println("No information");
    }

    public void findFilmByTitle2(String string){
        boolean flag = false;
        for (int i = 0; i < size; i++) {
            if (films[i].getTitle().equalsIgnoreCase(string)){
                flag = true;
                System.out.println("You can watch the following movie on " + films[i].getDate() + " in the following cinemas:");
                films[i].displayCinema();
                break;
            }
        }
        if(!flag){
            System.out.println("No information");
        }
    }
}


