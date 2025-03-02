package DZ_Object;

public class Book {
    private String author;
    private String book;
    private int year;

    public Book(String author, String book, int year){
        if (author.isEmpty()) {
            System.out.println("Такую книгу нельзя создать");
            String[] args = {};
            DZ_Object.Object.main(args);
        } else {
            this.author = author;
            this.book = book;
            this.year = year;

        }

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



}
