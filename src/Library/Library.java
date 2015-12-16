package Library;

import java.util.ArrayList;

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
public class Library {
    ArrayList<Reader> readers;
    ArrayList<Book> books;
    ArrayList<String> blackList;
    ArrayList<Book> gottenBooks;

    public void showReaders() {
        int i = 0;
        System.out.println("");
        for (Reader reader : readers) {
            System.out.print(" " + reader.name + ";");
        }
    }

    public void showBooksInLib() {
        int i = 0;
        for (Book book : books) {
            System.out.print(" " + book.name + ";");
        }
    }

    public void addBook(Book newbook) {
        for (Book book : books) {
            if (newbook.name.equals(book.name)) {
                book.quantity += newbook.quantity;
                System.out.println("You've increased number of" + newbook.name + "books in library");
                break;
            } else {
                books.add(newbook);
                break;
            }
        }
    }

    public void addReader(Reader newReader) {
        readers.add(newReader);
    }

    public void giveBook(Reader reader, Book someBook) {
        if (blackList.contains(reader.name)) {
            System.out.println("You are in a black list");
        } else if (reader.bookQuantity >= 3) {
            System.out.println("You can't carry anymore");
        } else if (books.contains(someBook)) {
            for (int i = 0; i < reader.bookQuantity; i++) {
                if (reader.booksAtHome[i] == null) {
                }
                reader.booksAtHome[i] = someBook;
                gottenBooks.add(someBook);
                reader.bookQuantity++;
                System.out.println(someBook.name + " was added");
                if (someBook.quantity == 0) {
                    books.remove(someBook);
                } else {
                    someBook.quantity -= someBook.quantity;
                }
                break;
            }
        }
    }

    public void showGottenBooks() {
        System.out.println("Gotten book:");
        for (Book book : gottenBooks) {

            System.out.print(" " + book.name + ";");
        }
    }

    public void showUserBooks(Reader reader) {
        if (reader.bookQuantity != 0) {
            System.out.println("User books are :");
            for (int i = 0; i < reader.booksAtHome.length; i++) {
                System.out.print(" " + reader.booksAtHome[i].name);
            }
        } else {
            System.out.println("You dont have any books");
        }
    }

    public void addToBlckList(Reader reader) {
        readers.add(reader);
        System.out.println(reader.name + "have been added to black list");
    }

    public void showAuthorBooks(String author) {
        for (Book book : books) {
            if (book.author.equals(author)) {
                System.out.print(book.name);
            }
        }
    }

    public void showBooksWrittenFrom(int year) {
        for (Book book : books) {
            if (book.publishedIn >= year) {
                System.out.print(book.name);
            }
        }
    }
}