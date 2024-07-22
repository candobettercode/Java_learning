import java.util.*;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[3];
        int sub[] = new int[3];

        int[] age = {97,34,57};

        int size = sc.nextInt();
        int number[] = new int[size];

        for(int i =0; i<size; i++){
            number[i] = sc.nextInt();
        }

        for (int i=0; i<size ; i++){
            System.out.println(number[i]);
        }

        System.out.println("sixe of the number array is "+number.length);


        marks[0] = 97;
        marks[1] = 89;
        marks[2] = 91;

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        for (int i=0; i<3; i++){
            System.out.println(marks[i]);
        }
    }    
}
