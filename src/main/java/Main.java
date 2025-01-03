import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a command (or 'exit' to quit): ");
            String input = scanner.nextLine();

            // Check if the user wants to exit
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the program.");
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];

            try {
                switch (command) {
                    case "add":
                        int addResult = calculator.add(Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
                        System.out.println("Result: " + addResult);
                        break;
                    case "subtract":
                        int subtractResult = calculator.subtract(Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
                        System.out.println("Result: " + subtractResult);
                        break;
                    case "multiply":
                        int multiplyResult = calculator.multiply(Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
                        System.out.println("Result: " + multiplyResult);
                        break;
                    case "divide":
                        int divideResult = calculator.divide(Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
                        System.out.println("Result: " + divideResult);
                        break;
                    case "fibonacci":
                        int fibonacciResult = calculator.fibonacciNumberFinder(Integer.parseInt(parts[1]));
                        System.out.println("Result: " + fibonacciResult);
                        break;
                    case "binary":
                        String binaryResult = calculator.intToBinaryNumber(Integer.parseInt(parts[1]));
                        System.out.println("Result: " + binaryResult);
                        break;
                    default:
                        System.out.println("Unknown command: " + command);
                }
            } catch (Exception e) {
                System.out.println("Error: Invalid input. Please enter the command in the correct format.");
            }
        }

        scanner.close();
    }
}
