import java.io.FileReader;

public class FileDemo {

    public static void main(String[] args) {

        try (FileReader reader =
                     new FileReader("books.txt")) {

            System.out.println("File Opened");

        }
        catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }
}
