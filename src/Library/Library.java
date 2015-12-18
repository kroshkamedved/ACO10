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

    public void showUserBooks(Reader reader) {
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
}
