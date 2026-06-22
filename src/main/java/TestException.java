import exceptions.MemberLimitException;

public class TestException {

    public static void main(String[] args) {

        try {
            throw new MemberLimitException();
        } catch (MemberLimitException e) {
            System.out.println(e.getMessage());
        }

    }
}