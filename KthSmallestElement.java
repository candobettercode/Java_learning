import java.util.*;

public class KthSmallestElement{
    public static int findkthsmallest(int[] arr, int k){
        int n = arr.length;

        for(int i=0; i<k; i++){
            int minIndex = 0;

            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;   
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        return arr[k-1];
    }

    public static void main(String[] args) {
        int [] arr = {7,10,4,3,20,15};
        int k = 3;

        int result = findkthsmallest(arr, k);
        System.out.println(k + "rd smallest element is: "+ result);
    }
}