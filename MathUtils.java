public class MathUtils {

    // Method to add two numbers
    static int add(int a, int b) {
        return a + b;
    }

    // Method to subtract two numbers
    static int subtract(int a, int b) {
        return a - b;
    }

    // Method to multiply two numbers
    static int multiply(int a, int b) {
        return a * b;
    }

    // Method to divide two numbers (with check)
    static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return 0;
        }
        return (double) a / b;
    }

    // Method to find factorial of a number
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to check if a number is prime
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Main method to test utilities
    public static void main(String[] args) {
        System.out.println("Add: " + add(10, 5));
        System.out.println("Subtract: " + subtract(10, 5));
        System.out.println("Multiply: " + multiply(10, 5));
        System.out.println("Divide: " + divide(10, 5));
        System.out.println("Factorial of 5: " + factorial(5));
        System.out.println("Is 7 prime? " + isPrime(7));
        System.out.println("Is 10 prime? " + isPrime(10));
    }
}
