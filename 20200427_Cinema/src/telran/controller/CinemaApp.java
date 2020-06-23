package telran.controller;

import telran.data.Address;
import telran.data.Cinema;
import telran.data.Film;
import telran.data.Genre;
import telran.dao.Schedule;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class CinemaApp {

    public static void main(String[] args) {

        Cinema cinema1 = new Cinema("IMAX");
        Cinema cinema2 = new Cinema("Thalia", new Address("Hauptstrasse", 15));
        Address address = new Address("Berlinstrasse", 10);
        Cinema cinema3 = new Cinema("CineStar", address);
        Cinema cinema4 = new Cinema("Space", new Address("Alexstrasse", 34));

        cinema1.setAddress(new Address("Neustrasse",4));

        Cinema cinema5 = new Cinema("Astra", new Address("Alexanderplatz", 1));

        Cinema[] cinemas1 = {cinema1, cinema3, cinema5};
        Cinema[] cinemas2 = {cinema2, cinema4, cinema5};

        Film film1 = new Film("Harry Potter", LocalDate.of(2020, 4, 29), Genre.ADVENTURE, cinemas1);
        Film film2 = new Film("Titanic", LocalDate.of(2020, 4, 30), Genre.DRAMA, cinemas2);
        Film film3 = new Film("Hail Ceaser", LocalDate.of(2020, 4, 29), Genre.COMEDY, cinemas2);
        Film film4 = new Film("Gone girlr", LocalDate.of(2020, 5, 1), Genre.THRILLER, cinemas1);
        Film film5 = new Film("You", LocalDate.of(2020, 5, 2), Genre.THRILLER, cinemas1);

        Schedule schedule = new Schedule(20);
        schedule.addFilm(film1);
        schedule.addFilm(film2);
        schedule.addFilm(film3);
        schedule.addFilm(film4);
        schedule.addFilm(film5);

        //schedule.displayFilmsByDate(LocalDate.of(2020, 4, 29));
        //schedule.displayFilmsByCinema("XXX");
        //schedule.displayCinemasByFilmTitle("Titanic");
//        System.out.println(schedule.getIndexOfFilm("You"));
        //System.out.println(schedule.getIndexOfFilmByGenre(Genre.THRILLER));
        schedule.displayCinemaByFilmGenre(Genre.THRILLER);
//        schedule.displayFilmsByGenre(Genre.COMEDY);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the name of film");
//        String str = scanner.nextLine();
//        schedule.findFilmByTitle2(str);
//
//        scanner.close();

    }
}
