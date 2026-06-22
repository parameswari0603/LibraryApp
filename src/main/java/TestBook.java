import exceptions.BookNotFoundException;

public class TestBook {

    public static void main(String[] args) {

        try {

            throw new BookNotFoundException(101);

        } catch (BookNotFoundException e) {

            System.out.println(e.getMessage());

        }

    }
}