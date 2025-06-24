import java.util.*;

public class Sort012 {
    
    public static void main(String[] args) {
        
        int [] arr = {2,1,0,2,2,1,0,1,0,2};

        int count0=0, count1 = 0, count2 = 0;

        for (int i =0; i < arr.length; i++){
            if (arr[i] == 0){
                count0++;
            } else if (arr[i]==1){
                count1++;
            } else if (arr[i]==2){
                count2++;
            }
        }

        for (int i =0; i<count0; i++){
            arr[i] = 0;
        }

        for( int i = count0; i<count0+count1; i++){
            arr[i] = 1;
        }

        for (int i = count0+count1; i< arr.length; i++){
            arr[i]=2;
        }

        System.out.println("Sorted Array: ");
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
