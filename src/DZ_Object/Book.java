package DZ_Object;

public class Book {

    private Author author;
    private String book;
    private int year;

    public Book(Author author, String book, int year) {
        this.author = author;
        this.book = book;
        this.year = year;

    }

public Author getAuthor() {
    return author;
}

public String getBook(){
        return book;
}

public int getYear() {
    return year;
}

public int setYear(int year) {
    this.year = year;
    return year;
}

@Override
public String toString(){
        return "Книга " + book + ", автор " + author + ", изд. " + year + " года.";
}

}
