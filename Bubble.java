import java.util.*;

public class Bubble {

    public static void printArray(int arr[]){
       for( int i =0; i<arr.length; i++){
        System.out.print(arr[i]+" ");
       } 
    }

    public static void main(String[] args) {
        
        int arr[] = {7,8,3,1,2};
// time complecity = O(n^2)
        for(int i=0; i<arr.length-1 ; i++){  //n-1
            for(int j =0; j<arr.length-i-1; j++){  //
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        printArray(arr);
    }
    
}
