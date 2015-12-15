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
    ArrayList blackList;

    public void showReaders(){
        int i = 0;
        System.out.println("");
        for(Reader reader : readers){
            System.out.print(" " + reader.name);
        }
    }

    public  void showBooksInLib{
        int i = 0;
        for (Book books : books )
    }

 }


