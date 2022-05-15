
import java.util.Objects;

public class Author {

    private String authorName;
    private String authorSurname;

    public Author(String authorSurname, String authorName) {
         this.authorSurname =  authorSurname;
         this.authorName = authorName;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public String getAuthorSurname() {
        return this.authorSurname;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass() || this.getClass() == null) {
            return false;
        }

        Author authorName = (Author) other;
        Author authorSurname = (Author) other;
        return authorName.equals(authorName.authorName) &&
        authorSurname.equals(authorSurname.authorSurname);

    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName, authorSurname);
    }

    @Override
    public String toString() {
        return "Author name is - " + this.authorSurname + " " + this.authorName + ".";
    }

}
