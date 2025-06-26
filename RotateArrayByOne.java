import java.util.*;

public class RotateArrayByOne {

    public static void rotateArray(int [] arr){
        int n = arr.length;
        int last = arr[n-1];

        for (int i = n-1; i>0; i--){
            arr[i] = arr[i-1];
        }

        arr[0] = last;
    }

    public static void printArray(int[] arr){
        for (int num:arr){
            System.out.print(num + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        System.out.println("Original Array: ");
        printArray(arr);

        rotateArray(arr);

        System.out.println("Array after rotatingby one position: ");
        printArray(arr);
    }
}
