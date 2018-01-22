package ooplap7;

import com.sun.xml.internal.bind.v2.model.core.ID;
import java.util.Scanner;
public class StudentApp {
    public static void main(String[] args) {
        //creat object as Student
        Student s1 = new Student();
        s1.setId("111111111111");
        s1.setName("Boy Saiyai");
        s1.setMajor("Information system");
        s1.setGroup("Is221");

        Student s2 = new Student("222222222222",
                "Gril Saiyai",
                "Maketing",
                "MK221");
        showData(s1);
        showData(s2);

        Student s3 = new Student();
        s3 = inputData(s3);


    }  //main
    private static Student inputData(Student s){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter student info: ");
        System.out.println("Enter student Id: ");
        s.setId(scanner.nextLine());
        System.out.println("Enter student name: ");
        s.setName(scanner.nextLine());
        System.out.println("Enter student major: ");
        s.setMajor(scanner.nextLine());
        System.out.println("Enter student group: ");
        s.setGroup(scanner.nextLine());
        return s;

    }//inputdata
    private  static  void showData(Student s){
        System.out.println("Student info:  ");
        System.out.println("Id:  "+s.getId());
        System.out.println("Name:  "+s.getName());
        System.out.println("Major:  "+s.getMajor());
        System.out.println("Group:  "+s.getGroup());


    }//showData
}//class