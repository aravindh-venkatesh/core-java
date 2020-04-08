package exception_handling;

public class Main {
    public static void main(String[] args) {
        //customException();
        System.out.println();
        exceptionCause();
    }

    public static void customException() {
        try {
            System.out.println("Inside try block: Custom Exception");
            throw new CustomException();
        } catch (CustomException customException) {
            System.out.println("Exception:" + customException);
            customException.printStackTrace();
        }
    }

    public static void exceptionCause() {
        try {
            System.out.println("Inside try block: Exception Cause");
            CustomException customException = new CustomException();
            customException.initCause(new IllegalAccessError());
            throw customException;
        } catch (CustomException customException) {
            System.out.println("Exception:" + customException);
            System.out.println("Exception cause: " + customException.getCause());
        }
    }
}
