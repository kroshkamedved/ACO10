package Library;

import sun.misc.IOUtils;
import sun.nio.ch.IOUtil;

import java.io.*;
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
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Library lib = new Library();

        Book book = new Book("Belaya Gvaridiya", "Bulgakov", 1988);
        Book book1 = new Book("Dni Turbinuh", "Bulgakov", 1980);
        Book book2 = new Book("Sherlock Holms", "Konan Doyle", 1960);
        Book book3 = new Book("Unknown", "Brigada2", 2000);

        Reader reader1 = new Reader("Sasha", 25);
        Reader reader2 = new Reader("Vasja", 30);
        Reader reader3 = new Reader("Arsen", 45);


        lib.addReader(reader1,reader2,reader3);
        lib.addBook(book,book1,book2,book3);
        lib.showBooksInLib();
        lib.showReaders();
        System.out.println();
        lib.addToBlckList(reader1);
        System.out.println( reader1.takeBook(book));
        System.out.println( lib.giveBook(reader1,book1));
        System.out.println(lib.giveBook(reader1,book2));
        System.out.println(lib.giveBook(reader1,book3));
        System.out.println(reader1.isCanGetbook());
        reader1.showReaderBooks();
        System.out.println();
        System.out.println(reader2.takeBook(book1));
        lib.showAuthorBooks("Bulgakov");
        lib.showBooksWrittenFrom(1999);
        reader3.takeBook(book3);
        lib.showUserBooks();
        lib.showBooksInLib();

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("lib.txt"));

        oos.writeObject(lib);
        oos.close();

        Library lib2 = new Library();
        ObjectInputStream ois =  new ObjectInputStream(new FileInputStream("lib.txt"));
        lib2 = (Library)ois.readObject();
        System.out.println("************************************************************************");
        lib2.showBooksInLib();
        ois.close();


        BufferedReader br = new BufferedReader(new FileReader("menu.txt"));
        StringBuffer sb = new StringBuffer();
        String line = br.readLine();

        while (line != null){
            sb.append(line);
            sb.append(System.lineSeparator());
            line = br.readLine();
        }

        String allText = sb.toString();

        System.out.println(allText);

        System.out.println("****************************NNNNNNNNNN**************************");

        Menu menu = new Menu();
        menu.showMenu();










    }
}