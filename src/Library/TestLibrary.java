package Library;

import java.util.Scanner;

/*
Написать программу позволяющую узнать следующую информацию:
     1) посмотреть список читателей
     2) посмотреть список доступных книг
     3) добавить книгу в библиотеку
     4) добавить читателя в список читателей
     5) выдать книгу читателю (если книга есть в наличии).
        Читателю запрещается брать больше 3-х книг.
     6) посмотреть список книг, которые находятся у читателей
     7) посмотреть список книг, которые находятся у конкретного читателя
     8) добавить читателя в черный список (ему нельзя выдавать книги)
     9) посмотреть книги конкретного автора
     10) посмотреть новые книги (год издания выше 2013)
 */
public class TestLibrary {
    public static void main(String[] args) {
        Library lib = new Library();

        Book book = new Book("Belaya Gvaridiya", "Bulgakov", 1988);
        Book book1 = new Book("Dni Turbinuh", "Bulgakov", 1980);
        Book book2 = new Book("Sherlock Holms", "Konan Doyle", 1960);
        Book book3 = new Book("Unknown", "Brigada", 2000);

        Reader reader1 = new Reader("Sasha", 25);
        Reader reader2 = new Reader("Vasja", 30);
        Reader reader3 = new Reader("Arsen", 45);


        lib.addReader(reader1,reader2,reader3);
        lib.addBook(book,book1,book2,book3);
        lib.showBooksInLib();
        lib.showReaders();




    }
}