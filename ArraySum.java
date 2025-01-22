import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading the size of the array
        int size = scanner.nextInt();
        int[] array = new int[size];

        // Reading elements into the array
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();

        // Print the array and calculate sum
        System.out.print("Array: [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + (i < array.length - 1 ? ", " : ""));
        }
        System.out.println("]");
        
        // Calling the Sum method
        Sum(array);
    }

    // Method to calculate the sum of array elements
    public static void Sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i]; // Correctly adding array elements
        }
        System.out.println("Sum: " + sum);
    }
}
