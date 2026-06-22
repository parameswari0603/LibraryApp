public class FinallyDemo {

    public static void main(String[] args) {

        try {

            System.out.println("Borrowing Book");

        } finally {

            System.out.println("Closing Database Connection");

        }

    }
}
