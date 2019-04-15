/**
 * Java OOP. Lesson 03.
 *
 * @author Oleg Khrulov
 * @version dated 11.04.2019
 */

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
