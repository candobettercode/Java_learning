import java.util.Arrays;

public class ReverseArray {

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // for newline after printing array
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 6, 5};

        int n = arr.length;
        int[] temp = new int[n];

        // Copy elements in reverse order into temp
        for (int i = 0; i < n; i++) {
            temp[i] = arr[n - i - 1];
        }

        // Copy back into arr
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }

        // Print the reversed array
        printArray(arr);
    }
}
