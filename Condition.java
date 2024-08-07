import java.util.*;

public class Condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //int age = sc.nextInt();

        //if (age>18){
        //    System.out.println("ADULT");
        //}
        //else {
        //    System.out.println("NOT ADULT");
        //}

        //int num = sc.nextInt();
        
        //if(num%2 == 0){
        //    System.out.println("EVEN NUMBER");
        //}
        //else{
        //    System.out.println("ODD NUMBER");
        //}

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b){
            System.out.println("Equal");
        }
        else if (a > b) {
                System.out.println("A is greater"); 
        }
        else {
            System.out.println("A is smaller");
        }
    }
}
