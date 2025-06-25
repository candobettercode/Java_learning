import java.util.*;

public class UnionOfArrays {
    
    public static boolean isPresent(int[] arr, int size, int key){
        for(int i=0; i < size; i++)
        {
            if(arr[i] == key){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[] a = {1,2,3,4,5};
        int[] b = {3,4,5,6,7};

        int[] union = new int[a.length + b.length];
        int index = 0;

        for(int i=0; i<a.length; i++){
            if(!isPresent(union, index, a[i])){
                union[index] = a[i];
                index ++;
            }
        }
        
        for(int i=0; i<b.length; i++){
            if(!isPresent(union, index, b[i])){
                union[index] = b[i];
                index ++;
            }
        }

        System.out.println("Numbers of element  in union: " + index);
        System.out.print("Union Elements: ");

        for(int i = 0; i<index; i++){
            System.out.print(union[i] + " ");
        }

    }

}
