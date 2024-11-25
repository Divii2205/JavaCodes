import java.util.*;
class Student{
    String name;
    String email;
    String phoneNo;
    double cgr;
    int ICPmarks;
    int WDmarks;
    int DMmarks;

    Student(String n, String e, String p){
        name = n;
        email = e;
        phoneNo = p;
        cgr = 5;
    }
}
public class ClassesIntro1 {
    public static void main(String[] args) {
        Student s1 = new Student("divii", "d@sst.com", "451565153");
        // Student s2 = new Student();

        System.out.println(s1);
        // System.out.println(s2);
        
        // s1.name = "Divii";
        // s1.email = "d@gmail.com";
        System.out.println(s1.name);

        Student s3;
        s3 = s1;
        System.out.println(s3.email);
        
        // s3.cgr = 9.5;
        System.out.println(s1.cgr);

        // creating array of students
        Student[] arr = new Student[100];

        // creating arrayList of students
        ArrayList<Student> list = new ArrayList<Student>();
    }
}