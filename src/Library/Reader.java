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
public class Reader{
    private String name;
    private int age;
    private static final int limit = 3;
    private boolean inBlackList = false;
    private ArrayList<Book> gottenBooks = new ArrayList<>();

    public  Reader(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int gottenBooksSize(){
        return gottenBooks.size();
    }

    public String getName(){
        return this.name;
    }

    public int getAge (){
        return this.age;
    }

    public boolean isInBlackList() {
        return inBlackList;
    }

    public int getLimit() {
        return limit;
    }

    public boolean isCanGetbook() {
        return gottenBooks.size()<limit;
    }

    public void setInBlackList(boolean blockStatus){
        this.inBlackList = blockStatus;
    }

    public void showReaderBooks(){
        for(Book book : gottenBooks){
            System.out.println(book);
        }
    }

    public boolean takeBook(Book book) {
        if (!(gottenBooks.size()<limit)) return false;
        if (this.inBlackList) return false;
        if (book.isBookInLibarary()) {
            this.gottenBooks.add(book);
            book.setBookInLibarary(false);
            return true;
        }
       return false;
    }

}
