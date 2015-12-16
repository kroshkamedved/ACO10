package Library;

/**
 * Created by gavri on 16.12.2015.
 */
public class Librarian {

    public void showReaders(Library lib) {
        int i = 0;
        System.out.println("");
        for (Reader reader : lib.readers) {
            System.out.print(" " + reader.name + ";");
        }
    }

    public void showBooksInLib(Library lib) {
        int i = 0;
        for (Book book : lib.books) {
            System.out.print(" " + book.name + ";");
        }
    }

    public void addBook(Book newbook,Library lib) {
        for(Book book : lib.books) {
            if (newbook.name.equals(book.name)) {
                book.quantity += newbook.quantity;
                System.out.println("You've increased number of" + newbook.name + "books in library");
                break;
            } else {
                lib.books.add(newbook);
                System.out.println("Book added");
                break;
            }
        }
    }

    public void addReader(Reader newReader,Library lib) {
        lib.readers.add(newReader);
    }

    public void giveBook(Reader reader, Book someBook,Library lib) {
        if (lib.blackList.contains(reader.name)) {
            System.out.println("You are in a black list");
        } else if (reader.bookQuantity >= 3) {
            System.out.println("You can't carry anymore");
        } else if (lib.books.contains(someBook)) {
            for (int i = 0; i < reader.bookQuantity; i++) {
                if (reader.booksAtHome[i] == null) {
                }
                reader.booksAtHome[i] = someBook;
                lib.gottenBooks.add(someBook);
                reader.bookQuantity++;
                System.out.println(someBook.name + " was added");
                if (someBook.quantity == 0) {
                    lib.books.remove(someBook);
                } else {
                    someBook.quantity -= someBook.quantity;
                }
                break;
            }
        }
    }

    public void showGottenBooks(Library lib) {
        System.out.println("Gotten book:");
        for (Book book : lib.gottenBooks) {

            System.out.print(" " + book.name + ";");
        }
    }

    public void showUserBooks(Reader reader) {
        if (reader.bookQuantity != 0) {
            System.out.println("User books are :");
            for (int i = 0; i < reader.booksAtHome.length; i++) {
                System.out.print(" " + reader.booksAtHome[i].name);
            }
        } else{
            System.out.println("You dont have any books");
        }
    }

    public void addToBlckList (Reader reader,Library lib){
        lib.readers.add(reader);
        System.out.println(reader.name + "have been added to black list");
    }

    public void showAuthorBooks(String author, Library lib) {
        for (Book book : lib.books) {
            if (book.author.equals(author)) {
                System.out.print(book.name);
            }
        }
    }
    public void showBooksWrittenFrom(int year, Library lib) {
        for (Book book : lib.books) {
            if (book.publishedIn >= year ) {
                System.out.print(book.name);
            }
        }
    }
}


