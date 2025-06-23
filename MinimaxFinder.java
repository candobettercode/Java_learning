import java.util.*;

public class MinimaxFinder {
    
    public static int findmini(int [] a, int N){
        int mini = Integer.MAX_VALUE;
        for (int i =0; i<N; i++){
            if (a[i]< mini)
                mini = a[i];
        }
        return mini;
    }

    public static int findmax(int [] a, int N){
        int max = Integer.MIN_VALUE;
        for (int i =0; i<N; i++){
            if (a[i]> max)
                max = a[i];
        }
        return max;
    }

    public static void main(String[] args){
        int [] arr = {9,4,5,2,6,3};

        int n = arr.length;

        System.out.println("Minimum element is: "+ findmini(arr, n));

        System.out.println("Maximum element is: "+ findmax(arr,n));

    }
}
