public class ArraysUtils {

    // Print array elements
    static void printArray(int[] arr) {
        System.out.print("Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Find maximum element
    static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }
        return max;
    }

    // Find minimum element
    static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
        }
        return min;
    }

    // Calculate sum
    static int sum(int[] arr) {
        int total = 0;
        for (int num : arr) {
            total += num;
        }
        return total;
    }

    // Calculate average
    static double average(int[] arr) {
        return (double) sum(arr) / arr.length;
    }

    // Search for an element
    static boolean contains(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) return true;
        }
        return false;
    }

    // Reverse array
    static void reverse(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Main method to test utilities
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        printArray(numbers);
        System.out.println("Max: " + findMax(numbers));
        System.out.println("Min: " + findMin(numbers));
        System.out.println("Sum: " + sum(numbers));
        System.out.println("Average: " + average(numbers));
        System.out.println("Contains 30? " + contains(numbers, 30));
        System.out.println("Contains 99? " + contains(numbers, 99));

        reverse(numbers);
        System.out.print("Reversed ");
        printArray(numbers);
    }
}
