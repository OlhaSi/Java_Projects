package telran.controller;

import telran.data.*;

public class PrintableApp {

    public static void main(String[] args) {
        Book book1 = new Book("The little prince");
        Printable book2 = new Book("War and peace");
        Printable magazine = new Magazine("Vogue");
        Printable newspaper = new Newspaper();
        Printable pipe = new WaterPipe();
        Statable pipe1 = new WaterPipe();
        Statable lamp = new Lamp();

        ((Book)book2).setAuthor("Tolstoy");

        Printable[] printableProducts = {book1, book2, magazine, newspaper, new Newspaper(), pipe};

        for (Printable p : printableProducts) {
            read(p);
        }

        pipe1.printState(1);
        lamp.printState(1);

        Printable p = new Printable() {
            @Override
            public void print() {
                System.out.println("Hello");
            }
        };
    }

    static void read(Printable p){
        p.print();
    }

//    static Printable createPrintable(String title, boolean option){
//        if(option){
//            return new Book();
//        }
//    }
}
