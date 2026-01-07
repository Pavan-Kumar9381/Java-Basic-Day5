public class MethodsDemo {
    // 1. Simple method (no parameters, no return)
    static void greet() {
        System.out.println("Hello! Welcome to MethodsDemo.");
    }
    // 2. Method with parameters (no return)
    static void printSum(int a, int b) {
        int sum = a + b;
        System.out.println("Sum of " + a + " and " + b + " = " + sum);
    }

    // 3. Method with return value
    static int square(int n) {
        return n * n;
    }
    // 4. Method overloading (same name, different parameters)
    static int multiply(int a, int b) {
        return a * b;
    }
    static double multiply(double a, double b) {
        return a * b;
    }
    // 5. Method calling another method
    static void showSquare(int n) {
        System.out.println("Square of " + n + " = " + square(n));
    }
    public static void main(String[] args) {
        // Call greet method
        greet();
        // Call method with parameters
        printSum(10, 20);
        // Call method with return value
        int result = square(5);
        System.out.println("Returned square = " + result);
        // Call overloaded methods
        System.out.println("Multiply integers: " + multiply(4, 5));
        System.out.println("Multiply doubles: " + multiply(2.5, 3.5));
        // Call method that uses another method
        showSquare(7);
    }
}
