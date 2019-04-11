package Lesson03.Exception;

public class NegativeValueException extends Exception{
    private String userMessage;

    public NegativeValueException(String userMessage) {
        super();
        this.userMessage = userMessage;
    }

    public NegativeValueException() {
        super();
    }

    @Override
    public String getMessage() {
        return userMessage;
    }

    public String getUserMessage() {
        return userMessage;
    }
}
