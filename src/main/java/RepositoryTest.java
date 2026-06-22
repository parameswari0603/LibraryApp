import java.util.List;
import org.example.models.Book;

public class RepositoryTest {

    public static void main(String[] args) {

        FileRepository repo = new FileRepository();

        List<Book> books = repo.load();

        System.out.println("Books Loaded:");

        for (Book book : books) {
            System.out.println(book);
        }

        repo.save(books);

        System.out.println("Books Saved Successfully");
    }
}