package exception_handling;

public class CustomException extends Exception {
    private int errorCode;

    public CustomException() {
        errorCode = -1;
    }

    @Override
    public String toString() {
        return "Custom Error: " + errorCode;
    }
}
