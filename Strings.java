import java.util.*;

import javax.sound.midi.Soundbank;

public class Strings {
    public static void main(String[] args) {
        
        String name = "Tony";
        String fullname = "Tony Starc";
        String sentence = "This is an apple!!!";

        Scanner sc = new Scanner(System.in);

        //String a = sc.next();
        //System.out.println("Your name is "+ a);

        //String s = sc.nextLine();
        //System.out.println("Your name is "+ s);

        String fname = "Tony";
        String lname = "Starc";

        String full_name = fname+" "+lname;

        System.out.println(full_name);
        System.out.println(full_name.length());

        for (int i =0; i<full_name.length();i++){
            System.out.println(full_name.charAt(i));
        }

        String name1 = "Tonys";
        String name2 = "Tony";

        if (name1.compareTo(name2)==0){ 
            System.out.println("Strings are equal!!");      
        }
        else{
            System.out.println("Strings are nt equal");
        }

        if (name1 == name2){ 
            System.out.println("Strings are equal!!");      
        }
        else{
            System.out.println("Strings are nt equal");
        }

        if ( new String("Tony")==new String("Tony")){
            System.out.println("Strings are equal!!");      
        }
        else{
            System.out.println("Strings are nt equal");
        }

        String sent = "My name is Tony";

        String sentt = sent.substring(8,sent.length());

        System.out.println(sentt);
    }
}
