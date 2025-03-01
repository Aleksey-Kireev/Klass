package DZ_Object;

public class Book {
    private String book;
    private int year;

    public Book(String nameAuthor, String book, int year){
        if (nameAuthor.isEmpty()) {
            System.out.println("Такую книгу нельзя создать");
            String[] args = {};
            DZ_Object.Object.main(args);
        } else {
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
