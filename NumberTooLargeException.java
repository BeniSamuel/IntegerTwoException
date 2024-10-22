// Define custom exception class
class NumberTooLargeException extends Exception {
    public NumberTooLargeException(String message) {
        super(message);  // Pass the custom message to the parent Exception class
    }
}
