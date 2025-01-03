import java.util.UUID;

class Calculator {

    Calculator() {

    }

    /* Added a comment */
    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    /*
    Returns the n'th number in the Fibonacci sequence
    */
    int fibonacciNumberFinder(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be a positive integer");
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        int a = 1, b = 1;
        for (int i = 3; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    /*
    Returns binary value of the given int number as a String
    */
    String intToBinaryNumber(int number) {
        return Integer.toBinaryString(number);
    }

    /*
    Creates a completely unique String identifier for a given string
    */
    String createUniqueID(String n) {
        return n + UUID.randomUUID().toString();
    }

}
