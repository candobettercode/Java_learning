import java.util.*;

class Pen{
    String color;
    String type; //ballpen; gel

    public void write(){
        System.out.println("Writing something....");
    }

    public void printColor(){
        System.out.println(this.color);
    }
}

class Student{
    String name;
    int age;

    Student(String name, int age){
        System.out.println("Constructor called..");
        this.name = name;
        this.age = age;
    }

    Student (Student s){
        this.name = s.name;
        this.age = s.age;
    }

    Student(){
        
    }

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class Oops {

    public static void main(String[] args) {

        //Pen pen1 = new Pen();

        //pen1.color = "Blue";
        //pen1.type = "Gel";

        //pen1.write();

        //Pen pen2 = new Pen();

        //pen2.color = "Black";
        //pen2.type = "Ballpen";

        //pen1.printColor();
        //pen2.printColor();

        Student s1 = new Student();
        Student s2 = new Student("Ravina", 34);

        s1.name = "aman";
        s1.age = 23;

        Student s3 = new Student(s2);

        s3.printInfo();

        //s1.printInfo();
        s2.printInfo();
    }
}