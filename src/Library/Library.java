package Library;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.ArrayList;
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

public class Library implements Serializable {
    ArrayList<Reader> readers = new ArrayList<>();
    ArrayList<Book> books = new ArrayList<>();

    public void showReaders() {
        System.out.println("Readers list:");
        for (Reader reader : readers) {
            System.out.print(" " + reader.getName() + ";");
        }
    }

    public void showBooksInLib() {
        System.out.println("Books present in library:");
        for (Book book : books) {
            if (book.isBookInLibarary())
            System.out.println(" " + book + ";");
        }
    }

    public void addBook(Book... newBooks) {
        for (Book newBook : newBooks) {
            this.books.add(newBook);
            newBook.setBookInLibarary(true);
        }
    }


    public void addReader(Reader... newReaders) {
        for (Reader reader : newReaders) {
            this.readers.add(reader);
        }
    }

    public boolean giveBook(Reader reader, Book someBook) {
        if (reader.isInBlackList()) {
            return false;
        } else if (!reader.isCanGetbook()) {
            return false;
        } else if (books.contains(someBook)&& someBook.isBookInLibarary()) {
            reader.takeBook(someBook);
            return true;
        }
        return false;
    }

    public void showGottenBooks() {
        System.out.println("Gotten books:");
        for (Book book : books) {
            if (book.isBookInLibarary())
                System.out.println();
            System.out.print(" " + book.getName() + ";");
        }
    }

    public void showUserBooks() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Rader Name");
        String readerName = bf.readLine();
        System.out.println("Please enter Rader age");
        int readerAge = sc.nextInt();
        Reader reader = null;
        for (Reader readr: readers) {
            if((readr.getName().equals(readerName)) & (readr.getAge() == readerAge)){
                reader = readr;
            }  else {
                System.out.println("There is no that Reader in lib");
                return;
            }
        }
        reader.showReaderBooks();
    }


    public void addToBlckList(Reader reader) {
        reader.setInBlackList(true);
        System.out.println(reader.getName() + "have been added to black list");
    }

    public void showAuthorBooks(String author) {
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                System.out.print(book);
                System.out.println();
            }
        }
    }

    public void showBooksWrittenFrom(int year) {
        for (Book book : books) {
            if (book.getPublishedIn() >= year) {
                System.out.print(book);
                System.out.println();
            }
        }
    }

    public boolean giveBook() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Rader Name");
        String readerName = sc.nextLine();
        System.out.println("Please enter Rader age");
        int readerAge = sc.nextInt();
        System.out.println("Please enter Book name");
        String bookTitle = sc.nextLine();

        Reader reader = null;
        for (Reader readr: readers) {
            if((readr.getName().equals(readerName)) ){
                reader = readr;
            }  else {
                System.out.println("There is no that Reader in lib");
                return false;
            }
        }

        Book someBook  = null;
        for (Book book: books) {
            if((book.getName().equals(bookTitle))){
                someBook = book;
            }  else {
                System.out.println("There is no that Book in lib");
                return false;
            }
        }

        if (reader.isInBlackList()) {
            return false;
        } else if (!reader.isCanGetbook()) {
            return false;
        } else if (books.contains(someBook)&& someBook.isBookInLibarary()) {
            reader.takeBook(someBook);
            return true;
        }
        return false;
    }
}
