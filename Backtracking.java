
import java.util.*;

public class Backtracking {

    public static void printPermutation(String str, String perm, int ind) {

        if(str.length() == 0){
            System.out.println(perm);
            return;
        }
        
        for (int i = 0; i<str.length(); i++){
            char currChar = str.charAt(i);
            System.out.println("-->"+ currChar);
            String newStr = str.substring(0, i) + str.substring(i+1);
            System.out.print("*-->"+ newStr);
            printPermutation(newStr, perm+currChar, ind+1);
        }
        
    }

    public static void main(String[] args) {
        
        String str = "ABC";
        printPermutation(str, " ", 0);
    }
}
