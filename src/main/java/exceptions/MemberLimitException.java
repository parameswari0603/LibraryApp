package exceptions;

public class MemberLimitException extends Exception {
    public MemberLimitException() {
        super("Member has reached borrowing limit.");
    }

}
