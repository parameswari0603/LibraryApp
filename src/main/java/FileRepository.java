
import java.io.*;
import java.util.*;
import org.example.models.Book;
import org.example.models.BookStatus;

public class FileRepository {

    public List<Book> load() {

        List<Book> books = new ArrayList<>();

        try (
                BufferedReader reader =
                        new BufferedReader(
                                new FileReader("books.csv"))
        ) {

            String line;

            while ((line = reader.readLine()) != null) {

                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String title = data[1];
                String author = data[2];
                int year = Integer.parseInt(data[3]);

                Book book =
                        new Book(
                                id,
                                title,
                                author,
                                year

                        );

                books.add(book);
            }

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

        return books;
    }

    public void save(List<Book> books) {

        try (
                BufferedWriter writer =
                        new BufferedWriter(
                                new FileWriter("books.csv"))
        ) {

            for (Book book : books) {

                writer.write(
                        book.getId() + "," +
                                book.getTitle() + "," +
                                book.getAuthor() + "," +
                                book.getYear()
                );

                writer.newLine();
            }

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }
    }
}
