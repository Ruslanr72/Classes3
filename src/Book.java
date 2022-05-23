import java.util.Objects;

public class Book {
    private String bookName;
    private   int bookYear;
    private Author author;


    public Book (String bookName, int bookYear, Author author) {
        this.bookName = bookName;
        this.bookYear = bookYear;
        this.author = author;

    }
    public int getBookYear(){
        return this.bookYear;
    }
    public Author getAuthor(){
        return this.author;
    }

    public String getBookName() {
        return this.bookName;
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
        return this.bookName.equals(bookName.bookName) && this.bookYear == bookYear && this.author.equals(author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, bookYear, author);
    }
    @Override
    public String toString(){
        return "Book name is -  " + bookName + ". " + "\nThe book year is - " + bookYear + "." + "\n"  + author.toString();
    }

}

