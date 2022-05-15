import java.util.Objects;

public class Book {
    private String bookName;
    private   int bookYear;
    private Author author;


    public Book (String bookName, int bookYear) {
        this.bookName = bookName;
        this.bookYear = bookYear;
    }
    public int getBookYear(){
        return this.bookYear;
    }

    public void setBookYear(int bookYear){
        this.bookYear = bookYear;
    }
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass() || other == null) {
            return false;
        }
        Book bookName = (Book) other;
        Book bookYear = (Book) other;
        return this.bookName.equals(bookName.bookName)&& bookYear.equals(bookYear.bookYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, bookYear);
    }
    @Override
    public String toString() {
        return "Book name is -  " + bookName + ". " + "\nThe book year is - " + bookYear + "." + author;
    }
}

