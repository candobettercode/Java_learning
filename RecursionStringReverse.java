import java.util.*;

public class RecursionStringReverse {
    
    public static void printRev(String arr, int ind){
        if(ind ==0){
            System.out.println(arr.charAt(ind));
            return; 
        }
        System.out.println(arr.charAt(ind));
        printRev(arr, ind-1);
    }

    public static void main(String[] args) {
        
        String str = "abcd";
        printRev(str, str.length()-1);
    }
}
// Time complexity
// o(n)   n--> lenght