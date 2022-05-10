
import java.util.Objects;

public class Author {

    private final String authorName;
    public Author(String nameAuthor) {
        this.authorName = nameAuthor;
    }
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author author = (Author) other;
        return authorName.equals(author.authorName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(authorName);
    }
    @Override
    public String toString() {
        return "Author name is - " + this.authorName + ".";
    }
}
