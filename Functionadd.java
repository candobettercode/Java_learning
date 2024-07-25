import java.util.*;

import javax.security.sasl.SaslException;

public class Functionadd {
    
    public static int calculateSum(int a,int b){
        int sum = a + b;
        return sum;
    }
public static void printFactorial(int a){
    if ( a < 0){
        System.out.println("Invalid number");       
        return;
    }
    int factorial = 1;
    for(int i = a; i>=1; i--){
        
        factorial *= i;
    }
    System.out.println(factorial);
    return;

}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = calculateSum(a, b);
        System.out.println("Sum of 2 numbers is "+ sum);

        int n = sc.nextInt();
        printFactorial(n);
    }
}
