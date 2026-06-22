import exceptions.*;

public class MultiCatchDemo {

    public static void main(String[] args) {

        try {

            throw new MemberLimitException();

        } catch (MemberLimitException e) {

            System.out.println(e.getMessage());

        }

    }
}