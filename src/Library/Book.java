package Library;

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
public class Book{
    private String name;
    private String author;
    private int publishedIn;
    private boolean bookInLibarary = false;

    @Override
    public String  toString(){
        return String.format("Book name is %s, book's author is %s and it was published in %d ", name, author, publishedIn );
    }

    public Book(String name, String author, int publishedIn){
        this.name = name;
        this.author = author;
        this.publishedIn = publishedIn;
    }

    public String getName(){
        return this.name;
    }

    public String getAuthor(){
        return this.author;
    }

    public int getPublishedIn(){
        return publishedIn;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setPublishedIn(int publishedIn){
        this.publishedIn = publishedIn;
    }

    public void setBookInLibarary(boolean bookInLibarary) {
        this.bookInLibarary = bookInLibarary;
    }

    public boolean isBookInLibarary() {
        return bookInLibarary;
    }

    @Override
    public boolean equals ( Object o){
        if (o == this) return true;

        if (o == null) return  false;

        if (o.getClass() != this.getClass()) return false;

        Book book = (Book) o;
        if(!this.name.equals(book.name)) return false;
        if(!this.author.equals(book.author)) return false;
        return  (this.publishedIn == book.publishedIn);


    }
}

