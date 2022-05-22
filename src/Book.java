import java.util.Objects;

public class Book {
    private String bookName;
    private   int bookYear;
    private Author author = new Author(){

    };

    public Book (String bookName, int bookYear) {
        this.bookName = bookName;
        this.bookYear = bookYear;
        

    }
    public int getBookYear(){
        return this.bookYear;
    }

    public String getBookName() {
        return this.bookName;
    }
    public void setBookYear(int bookYear){
        this.bookYear = bookYear;
    }
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass() || other.getClass() == null) {
            return false;
        }
        Book bookName = (Book) other;
        Book bookYear = (Book) other;
        Book author = (Book) other;
        return this.bookName.equals(bookName.bookName)&& bookYear.equals(bookYear.bookYear) && this.author.equals(author.author);
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

