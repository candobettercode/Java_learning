import java.util.*;

public class Factorial {

    public static int calculatefact(int n){
        
        if (n == 1 || n == 0){
            return 1;
        }
        int fact = n* calculatefact(n-1);
        return fact;
    }
    public static void main(String[] args) {
        int n = 5;
        int result = calculatefact(n);
        System.out.println(result);

    }
}
